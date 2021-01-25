/* 

*/
public class FamilyAccount {
    public static void main(String[] args){
        Boolean     operationFlag = true;
        String      inoutDetails = "";
        int         totalMoney = 10000;
        while(operationFlag){

            System.out.println("-----------------家庭收支管理系统----------------");
            System.out.println("                    1.收支明细");
            System.out.println("                    2.登记收入");
            System.out.println("                    3.登记支出");
            System.out.println("                    4.退出系统");
            System.out.println();
            System.out.println("                   请输入<1-4>");
            
            char menuSelection = Utility.readMenuSelection();
            switch(menuSelection){//注意类型为char型
                case '1':
                    //System.out.println("收支明细");
                    System.out.println("-----------------当前收支明细记录----------------");
                    System.out.println("收支\t账户金额\t收支金额\t备注");
                    System.out.println(inoutDetails);
                    System.out.println();
                    System.out.println("-------------------------------------------------");
                break;
                case '2':
                    System.out.println("本次收入金额:");
                    int     inDetails = Utility.readNumber();
                    System.out.println("本次收入说明:");
                    String  incomeCommentDetails = Utility.readString();
                    totalMoney = totalMoney + inDetails;
                    inoutDetails = inoutDetails + "收入\t" + totalMoney + "\t\t" + inDetails + "\t\t" + incomeCommentDetails + "\n";
                break;
                case '3':
                    System.out.println("本次支出金额:");
                    int     outDetails = Utility.readNumber();
                    System.out.println("本次支出说明:");
                    String  expenditureCommentDetails = Utility.readString();
                    if ((totalMoney - outDetails) < 0){
                        System.out.println("余额不足，支付失败！");
                    }else{
                        totalMoney = totalMoney - outDetails;
                        inoutDetails = inoutDetails + "支出\t" + totalMoney + "\t\t" + outDetails + "\t\t" + expenditureCommentDetails + "\n";
                    }
                break;
                case '4':
                    System.out.println("是否确认退出？<Y/N>");
                    char confirmSelection = Utility.readConfirmSelection();
                    if (confirmSelection == 'Y'){
                        operationFlag = false;
                    }
                break;
            }
        }
    }
}
