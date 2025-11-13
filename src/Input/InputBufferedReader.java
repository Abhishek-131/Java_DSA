package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("String Input Name : ");  //String Input
        String str = br.readLine();

        System.out.print("Integer : ");
        int num = Integer.parseInt(br.readLine()); // Integer Input

        System.out.print("Float : ");
        double dnum = Double.parseDouble(br.readLine());

        System.out.println();
        System.out.println("String : " + str);
        System.out.println("Integer : " + num);
        System.out.println("Double : " + dnum);

    }
}
