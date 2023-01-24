package tech.tresearchgroup.tesseract.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class TesseractOptions {
    @CommandLine.Option(names = "--tessdata-dir", description = "Specify the location of tessdata path")
    private String tessDataDir;

    @CommandLine.Option(names = "--user-words", description = "Specify the location of user words file")
    private String userWords;

    @CommandLine.Option(names = "--user-patterns", description = "Specify the location of user patterns file")
    private String userPatterns;

    @CommandLine.Option(names = "--dpi", description = "Specify DPI for input image")
    private String dpi;

    @CommandLine.Option(names = "--loglevel", description = "Specify logging level. LEVEL can be ALL, TRACE, DEBUG, INFO, WARN, ERROR, FATAL or OFF")
    private String logLevel;

    @CommandLine.Option(names = "-l", description = "Specify language(s) used for OCR")
    private String l;

    @CommandLine.Option(names = "-c", description = "Set value for config variables. Multiple -c arguments are allowed")
    private String c;

    @CommandLine.Option(names = "--psm", description = "Specify page segmentation mode")
    private String psm;

    @CommandLine.Option(names = "--oem", description = "Specify OCR Engine mode")
    private String oem;

    @CommandLine.Option(names = "-h", description = "Show minimal help message")
    private boolean h;

    @CommandLine.Option(names = "--help-extra", description = "Show extra help for advanced users")
    private boolean helpExtra;

    @CommandLine.Option(names = "--help-psm", description = "Show page segmentation modes")
    private boolean helpPsm;

    @CommandLine.Option(names = "--help-oem", description = "Show OCR Engine modes")
    private boolean helpOem;

    @CommandLine.Option(names = "-v", description = "Show version information")
    private boolean v;

    @CommandLine.Option(names = "--list-langs", description = "List available languages for tesseract engine")
    private boolean listLangs;

    @CommandLine.Option(names = "--print-fonts-table", description = "Print tesseract fonts table")
    private boolean printFontsTable;

    @CommandLine.Option(names = "--print-parameters", description = "Print tesseract parameters")
    private boolean printParameters;
}
