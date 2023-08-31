package session11.livesession.datatransformationsystem;

import java.util.List;

class PDFReport extends Raport implements PDFExportable {

    PDFReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }

    @Override
    public void exportToPDF() {

    }
}
