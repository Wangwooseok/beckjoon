import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer s;

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
       s = new StringTokenizer(br.readLine()," ");
      int a = Integer.parseInt(s.nextToken());
      int b = Integer.parseInt(s.nextToken());
      bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+ "\n");

    }
    br.close();

    bw.flush();
    bw.close();

  }
}
