import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int sum=0;
  int input=1;
  int count=0;
  double avg=0;

  while(input != 0){
    System.out.println("수를입력하세요.");
    input = sc.nextInt();
    count = count + 1;
    sum = input+sum;
  }
  avg = sum/count;
  System.out.println(avg);
  }
}