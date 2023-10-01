package session8_arrays.homework.diary;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    List<String> diaryList = new ArrayList<>();

    public void printAllEntries() {
        for (int index = diaryList.size() -1; index >=0; index--){
            System.out.println(diaryList.get(index));
        }
    }

    public String getEntryOn(String date) {
        LocalDate entryDate = getEntryDate(date);
        if (entryDate != null) {
            int index = getIndex(entryDate);
            if (index < 0) {
                return diaryList.get(Math.abs(index) - 1);
            }
        }
        return null;
    }

    public boolean editEntry(String date, String updatedEntryText) {
        LocalDate entryDate = getEntryDate(date);
        if (entryDate != null) {
            int index = getIndex(entryDate);
            if (index < 0) {
                String updatedEntry = date + " " + updatedEntryText;
                diaryList.set(Math.abs(index) - 1, updatedEntry);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEntry(String dateString) {
        LocalDate date = getEntryDate(dateString);
        if (date != null) {
            int index = getIndex(date);
            if (index < 0) {
                diaryList.remove(Math.abs(index) - 1);
                return true;
            }
        }
        return false;
    }

    public boolean addEntry(String entry) {
        LocalDate entryDate = getEntryDate(entry);
        if (entryDate != null) {
            int index = getIndex(entryDate);
            if (index < 0) {
                System.out.println("Entry with date " + entry.substring(0, 10) + " already in diary.");
                return false;
            } else {
                diaryList.add(index, entry);
                return true;
            }
        }
        return false;
    }

    private int getIndex(LocalDate entryDate) {
        int leftIndex = 0;
        int rightIndex = diaryList.size();
        while (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            LocalDate middleDate = getEntryDate(diaryList.get(middle));
            if (middleDate.isEqual(entryDate)) {
                return -(middle + 1);
            } else if (entryDate.isAfter(middleDate)) {
                leftIndex = middle + 1;
            } else {
                rightIndex = middle;
            }
        }
        return leftIndex;
    }

    private LocalDate getEntryDate(String entry) {
        StringBuilder stringBuilder = new StringBuilder();
        int stringIndex = 0;
        boolean separatorFound = false;
        while (!separatorFound && stringIndex < entry.length()) {
            char currentChar = entry.charAt(stringIndex);
            if (currentChar == ';') {
                separatorFound = true;
            } else {
                stringBuilder.append(entry.charAt(stringIndex++));
            }
        }
        try {
            return LocalDate.parse(stringBuilder);
        } catch (DateTimeParseException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
