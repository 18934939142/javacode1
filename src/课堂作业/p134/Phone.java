package 课堂作业.p134;

public class Phone {

    private static void printString(String[] newArr) {
        for (int i = 0; i <newArr.length ; i++) {
            System.out.println(newArr[i]);
        }
    }

    /**
     * 替换数字
     * @param numbers
     * @param numberCounts
     * @return
     */
    private static String[] replaceNumbers(String[] numbers, int[] numberCounts) {

        String[] results=new String[numbers.length];
        int replaceNum=getMaxNumber(numberCounts);//得到最大数的下标
        for (int i = 0; i <numbers.length; i++) {
            String repalceString = replaceOneString(replaceNum,numbers[i]);
            results[i]=repalceString;   //逐个给results[i]赋值
        }

        return results;
    }

    /**
     * 将字符串中某个字符与8进行互换
     * @param replaceNum
     * @param oldString
     * @return
     */
    private static String replaceOneString(int replaceNum, String oldString) {
        StringBuffer strBuf=new StringBuffer();
        //将数字转换为字符串  1->'1'
        char replacedChar = (char)(replaceNum+'0');
        for (int i = 0; i <oldString.length(); i++) {
            //获取oldString中的字符
            char ch = oldString.charAt(i);
            //如果字符串中的字符符合条件则替换
            if (ch==replacedChar){
                ch='8';
            }else if(ch=='8'){
                ch=replacedChar; //将8换为指定字符
            }
            strBuf.append(ch);
        }
        return strBuf.toString();
    }



    /**
     * 得到出现最多数字下标
     * @param numberCounts
     * @return 下标
     */
    private static int getMaxNumber(int[] numberCounts) {
        int currenMaxNumber = -1;
        int index=-1;

        //获取numberCounts中最大数
        for (int i = 0; i <numberCounts.length ; i++) {
            if (numberCounts[i]>currenMaxNumber){
                currenMaxNumber=numberCounts[i];
                index=i;
            }
        }
        return index;
    }

    /**
     * 打印统计好的数组
     * @param numArr 统计好的数组
     */
    private static void printArray(int[] numArr) {
        for (int i = 0; i <numArr.length; i++) {
            System.out.print(i+":"+numArr[i]+", ");
        }
        System.out.println();
    }

    /**
     *
     * @param numbers 传入的原始数组
     * @return 返回统计数组
     */
    private static int[] countNumbers(String[] numbers) {
        int[] numberArray=new int[10];
        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j <numbers[i].length() ; j++) {
                numberArray[numbers[i].charAt(j)-'0']++;
                //统计字符 如果numbers[i]=5 numberArray[5]+1;
            }
        }

        return  numberArray;
    }


    public static void main(String[] args) {
        String[] numbers = {"11934939132","10086","10010"};

        System.out.println("原始电话号码:>");
        for (int i=0;i<numbers.length;i++){
            System.out.println("号码"+(i+1)+": "+numbers[i]);
        }

        int[] numArr=countNumbers(numbers); //统计出现次数
        System.out.println("各数字出现频率:>");
        printArray(numArr);    //打印统计好的数组
        String[] newArr = replaceNumbers(numbers,numArr);
        System.out.println("高频数字与8交换后号码:");
        printString(newArr);

    }
}

