package com.abbyyocr.sdk;

public class ProcessingSettings {

    private String language = "English";
    private OutputFormat outputFormat = OutputFormat.pdfSearchable;

    public String asUrlParams() {
        return String.format("language=%s&exportFormat=%s", language,
                outputFormat);
    }

    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(OutputFormat format) {
        outputFormat = format;
    }

    public String getOutputFileExt() {
        switch (outputFormat) {
            case txt:
                return ".txt";
            case rtf:
                return ".rtf";
            case docx:
                return ".docx";
            case xlsx:
                return ".xlsx";
            case pptx:
                return ".pptx";
            case pdfSearchable:
            case pdfTextAndImages:
                return ".pdf";
            case xml:
                return ".xml";
        }
        return ".ocr";
    }

    public String getLanguage() {
        return language;
    }

    /*
     * Set recognition language. You can set any language listed at
     * http://ocrsdk.com/documentation/specifications/recognition-languages/ or
     * set comma-separated combination of them.
     *
     * Examples: English English,ChinesePRC English,French,German
     */
    public void setLanguage(String newLanguage) {
        language = newLanguage;
    }
    public enum OutputFormat {
        txt, rtf, docx, xlsx, pptx, pdfSearchable, pdfTextAndImages, xml
    }
}
