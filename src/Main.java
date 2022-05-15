import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws IOException {
        //Downloads webs.
        String link = "https://www.bbc.com/";
        URL url = new URL(link);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        String encoding = conn.getContentEncoding();

        InputStream input = conn.getInputStream();
        String result = new BufferedReader(new InputStreamReader(input))
                .lines().collect(Collectors.joining());
    }
}
