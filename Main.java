import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle = new Bicycle("ブリヂストン", "シルバー");
    System.out.println("【自転車情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください");
    int bicycleDistance = scanner.nextInt();
    bicycle.run(bicycleDistance);
    
    System.out.println("=================");
    Car car = new Car("ランボルギーニ", "ホワイト");
    System.out.println("【車情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください");
    int carDistance = scanner.nextInt();
    car.run(carDistance);
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください");
    int liter = scanner.nextInt();
    car.charge(liter);
  }
}