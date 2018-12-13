package com.edds.opensource.jsontojava.file;

import com.edds.opensource.jsontojava.exception.JsonToJavaException;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFileReader implements FileReader{

    @Override
    public String readJsonFromFile(String file) {
        try {
            return String.join(System.lineSeparator(), Files.readAllLines(Paths.get(file), Charset.forName(StandardCharsets.UTF_8.name())));
        } catch (IOException ioException) {
            throw new JsonToJavaException("IO error while accessing com.edds.opensource.jsontojava.file.", ioException);
        } catch (RuntimeException runtimeException) {
            throw new JsonToJavaException("Unexpected error while accessing com.edds.opensource.jsontojava.file.", runtimeException);
        }
    }
}