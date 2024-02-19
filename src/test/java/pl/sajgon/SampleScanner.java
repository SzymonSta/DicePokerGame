package pl.sajgon;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public interface SampleScanner {

    default Scanner createSampleScanner(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }
}
