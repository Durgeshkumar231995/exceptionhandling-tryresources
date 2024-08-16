package com.stackroute.exercises;

import org.junit.jupiter.api.*;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileEditionTests {

    private FileEdition fileEdition;
    private FileOutputStream fileOutputStream;
    private String message = "Check the logic in method fileEditor";
    private String expectedErrorMessage = "Given content to add is empty,null or blank space";

    @BeforeEach
    public void setUp() throws IOException {
        fileEdition = new FileEdition();
        fileOutputStream = new FileOutputStream("test.txt");
        fileOutputStream.write("Hi my name is".getBytes());
    }

    @AfterEach
    public void tearDown() {
        fileEdition = null;
        fileOutputStream = null;
    }

    @Test
    public void givenTwoStringsThenReturnAStringResult() throws IOException {
    	assertArrayEquals(fileEdition.fileEditor("test.txt", "John.F.Kennedy").getBytes(), new FileInputStream("test.txt").readAllBytes(), "Check the logic in method fileEditor");
    	//assertArrayEquals(fileEdition.fileEditor("test.txt ", "I am the 35th president of USA").getBytes(), new FileInputStream("test.txt").readAllBytes(), "Check the logic in method fileEditor should remove unwanted space");
    }

    @Test
    public void givenWrongFileNameAndContentThenReturnAnErrorString() {
        assertEquals("File 'test' not Found", fileEdition.fileEditor("test", "Barack Obama"), "Should use try and catch to catch error and return an error string");
    }

    @Test
    public void givenFileNameAndEmptyContentThenReturnAnErrorString() {
        assertEquals(expectedErrorMessage, fileEdition.fileEditor("test.txt ", ""), message);
    }

    @Test
    public void givenFileNameAndSpaceAsContentThenReturnAnErrorString() {
        assertEquals(expectedErrorMessage, fileEdition.fileEditor("demo", " "), message);
    }

    @Test
    public void givenFileNameAndNullAsContentThenReturnAnErrorString() {
        assertEquals(expectedErrorMessage, fileEdition.fileEditor(" test.txt", null), message);
    }

}
