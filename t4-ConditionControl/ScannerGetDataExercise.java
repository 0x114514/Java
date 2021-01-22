import java.util.Scanner;

public class ScannerGetDataExercise {
    public static void main(String[] args){
        String  name = "";
        int     age = 0;
        float   weight  = 0.0f;
        Boolean married = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        name = scan.next();
        System.out.println("请输入你的年龄:");
        age  = scan.nextInt();
        System.out.println("请输入你的体重:");
        weight  = scan.nextFloat();
        System.out.println("是否结婚:");
        married  = scan.nextBoolean();
        
        //对于char型的获取，Scanner没有直接的方法
        String  gender = "";
        System.out.println("请输入你的性别:");
        gender = scan.next();
        scan.close();
        char    genderChar = gender.charAt(0);//windows下需要使用GBK编码

        System.out.println("您的姓名是：" + name);
        System.out.println("您的年龄是：" + age);
        System.out.println("您的体重是：" + weight);
        System.out.println("是否结婚：" + married);
        System.out.println("您的性别是：" + genderChar);
    }
}
