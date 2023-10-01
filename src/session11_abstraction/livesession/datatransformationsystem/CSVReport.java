package session11_abstraction.livesession.datatransformationsystem;

import java.util.List;

class CSVReport extends Raport implements CSVExportable {

    CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportToCSV() {

    }
}
