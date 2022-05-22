package com.ssadhukhanv2.algo.algorepo.makeapicalls;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.net.*;

class GetApiCall { /* * Complete the 'getCapitalCity' function below. * * The function is expected to return a STRING. * The function accepts STRING country as parameter. * API URL: https:jsonmock.hackerrank.com/api/countries?name=<country> */
    public static String getCapitalCity(String country) {
        if (country == null || country.equals("")) {
            return "-1";
        }
        try {
            URL url = new URL("https:jsonmock.hackerrank.com/api/countries?name=" + country);
            HttpURLConnection httpURlConnection = (HttpURLConnection) url.openConnection();
            httpURlConnection.setRequestMethod("GET");
            httpURlConnection.addRequestProperty("Content-Type", "application/json");
            InputStream is = httpURlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            StringBuilder stringBuilder = new StringBuilder();
            String inputString = null;
            while ((inputString = bufferedReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            String jsonStr = stringBuilder.toString();
            if (jsonStr.contains("capital")) {
                //return "-1";
                System.out.print(jsonStr.length());
                String[] arr = jsonStr.split(",");
                Arrays.asList(arr).forEach(System.out::println);
                String fatCapital = arr[12].split(":")[1];
                System.out.println(fatCapital.substring(1, fatCapital.length() - 1));
                return fatCapital.substring(1, fatCapital.length() - 1);
            } else {
                return "-1";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String country = bufferedReader.readLine();
        String result = GetApiCall.getCapitalCity(country);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}