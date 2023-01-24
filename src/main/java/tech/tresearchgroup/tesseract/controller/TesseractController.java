package tech.tresearchgroup.tesseract.controller;

import tech.tresearchgroup.tesseract.model.TesseractOptions;

import java.util.ArrayList;
import java.util.List;

public class TesseractController {
    public static List<String> getOptions(TesseractOptions tesseractOptions) {
        List<String> optionsList = new ArrayList<>();
        if(tesseractOptions.getTessDataDir() != null) {
            optionsList.add("--tessdata-dir");
            optionsList.add(tesseractOptions.getTessDataDir());
        }
        if(tesseractOptions.getUserWords() != null) {
            optionsList.add("--user-words");
            optionsList.add(tesseractOptions.getUserWords());
        }
        if(tesseractOptions.getUserPatterns() != null) {
            optionsList.add("--user-patterns");
            optionsList.add(tesseractOptions.getUserPatterns());
        }
        if(tesseractOptions.getDpi() != null) {
            optionsList.add("--dpi");
            optionsList.add(tesseractOptions.getDpi());
        }
        if(tesseractOptions.getLogLevel() != null) {
            optionsList.add("--loglevel");
            optionsList.add(tesseractOptions.getLogLevel());
        }
        if(tesseractOptions.getL() != null) {
            optionsList.add("-l");
            optionsList.add(tesseractOptions.getL());
        }
        if(tesseractOptions.getC() != null) {
            optionsList.add("-c");
            optionsList.add(tesseractOptions.getC());
        }
        if(tesseractOptions.getPsm() != null) {
            optionsList.add("--psm");
            optionsList.add(tesseractOptions.getPsm());
        }
        if(tesseractOptions.getOem() != null) {
            optionsList.add("--oem");
            optionsList.add(tesseractOptions.getOem());
        }
        if(tesseractOptions.isH()) {
            optionsList.add("-h");
        }
        if(tesseractOptions.isHelpExtra()) {
            optionsList.add("--help-extra");
        }
        if(tesseractOptions.isHelpPsm()) {
            optionsList.add("--help-psm");
        }
        if(tesseractOptions.isHelpOem()) {
            optionsList.add("--help-oem");
        }
        if(tesseractOptions.isV()) {
            optionsList.add("-v");
        }
        if(tesseractOptions.isListLangs()) {
            optionsList.add("--list-langs");
        }
        if(tesseractOptions.isPrintFontsTable()) {
            optionsList.add("--print-fonts-table");
        }
        if(tesseractOptions.isPrintParameters()) {
            optionsList.add("--print-parameters");
        }
        return optionsList;
    }
}
