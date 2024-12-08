package LessonContent;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        System.out.println("Kiểm tra nay là thứ mấy ? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 2:{
                System.out.println(" Nay là thứ hai ");
                break;
            }
            case 3:{
                System.out.println(" Nay là thứ ba ");
                break;
            }
            case 4:{
                System.out.println(" Nay là thứ tư ");
                break;
            }
            case 5:{
                System.out.println(" Nay là thứ năm ");
                break;
            }
            case 6:{
                System.out.println(" Nay là thứ sáu ");
                break;
            }
            case 7:{
                System.out.println(" Nay là thứ bảy ");
                break;
            }
            case 8:{
                System.out.println(" Nay là chủ nhật ");
                break;
            }
            default:
                System.out.println(" Nhập dữ liệu sai ");
        }
    }
}
