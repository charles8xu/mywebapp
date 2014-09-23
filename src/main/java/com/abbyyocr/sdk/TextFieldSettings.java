package com.abbyyocr.sdk;

/*
 * Settings for processing text field via processTextField call
 */
public class TextFieldSettings {
    private String language = "English";
    private String textType = "normal,handprinted";
    /**
     * Extra options passed directly to RESTful call.
     */
    private String options = null;

    public String asUrlParams() {
        // For all possible parameters, see documentation at
        // http://ocrsdk.com/documentation/apireference/processTextField/
        String params = String.format("language=%s&textType=%s", language,
                textType);
        if (options != null && !options.isEmpty()) {
            params += "&" + options;
        }

        return params;
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

    public String getTextType() {
        return textType;
    }

    public void setTextType(String newTextType) {
        textType = newTextType;
    }

    public String getOptions() {
        return options;
    }

    /**
     * Set extra options directly passed to RESTful call.
     */
    public void setOptions(String newOptions) {
        options = newOptions;
    }
}
