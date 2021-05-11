package com.example.springbootdemo.demo.javaalgorithm;

import java.util.*;

public class SystemIn
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }
    }
}

/**
 * 第一行输入是组数
 */
class SystemInWithGroupNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> resultList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int index = 0;
            int groupNumber = scanner.nextInt();

            while (index < groupNumber) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                resultList.add(a + b);

                index++;
            }
            for (Integer r : resultList) {
                System.out.println(r);
            }
            resultList.removeAll(resultList);
        }
    }
}

class SystemIn22
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a + b == 0) {
                System.exit(0);
            }

            System.out.println(a + b);
        }
    }
}

class SystemIn33
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> resultList = new ArrayList<>();
        while (scanner.hasNextInt()) {

            int intNumber = scanner.nextInt();
            int index = 0;

            if (0 == intNumber) {
                for (Integer i : resultList) {
                    System.out.println(i);
                }
                System.exit(0);
            }

            int lineResult = 0;
            while (index < intNumber) {
                lineResult += scanner.nextInt();
                index++;
            }
            resultList.add(lineResult);
        }
    }
}

class SystemIn44
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> resultList = new ArrayList<>();
        while (scanner.hasNextInt()) {

            int lineNumber = scanner.nextInt();
            int lineIndex = 0;

            while (lineIndex < lineNumber) {
                int intNumber = scanner.nextInt();
                int index = 0;

                int lineResult = 0;
                while (index < intNumber) {
                    lineResult += scanner.nextInt();
                    index++;
                }
                resultList.add(lineResult);

                lineIndex++;
            }

            for (Integer i : resultList) {
                System.out.println(i);
            }

        }
    }
}

/**
 * 字符串排序
 */
class SystemInStringSort
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        while (scanner.hasNextInt()) {

            int stringNumber = scanner.nextInt();

            int index = 0;

            while (index < stringNumber) {

                stringList.add(scanner.next());

                index++;
            }

            stringList.sort(new Comparator<String>()
            {
                @Override
                public int compare(String o1, String o2)
                {
                    return o1.compareTo(o2);
                }
            });

            for (int i = 0; i < stringList.size(); i++)
            {
                String result = stringList.get(i);
                if (i != stringList.size() - 1)
                {
                    result += " ";
                }
                System.out.print(result);
            }

            stringList.removeAll(stringList);

        }
    }

}

class Mains
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            String line = scanner.nextLine();
            String[] strArr = line.split(" ");
            Arrays.sort(strArr, new Comparator<String>()
            {
                @Override
                public int compare(String o1, String o2)
                {
                    return o1.compareTo(o2);
                }
            });

            StringBuffer stringBuffer = new StringBuffer();
            for (String s : strArr)
            {
                stringBuffer.append(s).append(" ");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println(stringBuffer.toString());
        }
    }
}

//class Main2
//{
//    public static void main(String[] args)
//    {
//        Integer[] arr = new Integer[]{1,2,8,5};
//        Arrays.sort(arr, new Comparator<Integer>()
//        {
//            @Override
//            public int compare(Integer o1, Integer o2)
//            {
//                return o2 - o1;
//            }
//        });
//
//        for (int i : arr)
//        {
//            System.out.println(i);
//        }
//
//    }
//
//    static int main()
//    {
////        int a[50],s[50],b[50],m=0,n=0;/*m表示偶数个数，n表示奇数个数,s[50]表示存放偶数的数组，b[50]表示存放奇数的数组*/
//
//        int[] a,s,b;
//        int m,n = 0;
//
//        int j,t;
//        System.out.println("please input:\n");
////        for(int i=0;i<50;i++)
////        {
////            scanf("%d",&a[i]);
////        }
//        for(int i=0;i<50;i++)
//        {
//            if(i%2==0)
//            {
//                s[m]=a[i];
//                m++;
//            }
//            else
//            {
//                b[n]=b[i];
//                n++;
//            }
//        }
//        //对偶数按照升序排列//
//        for(i=0;i<m-1;i++)
//        {
//            for(j=0;j<m-1-i;j++)
//            {
//                if(s[j]>s[j+1])
//                {
//                    t=s[j];
//                    s[j]=s[j+1];
//                    s[j+1]=t;
//                }
//            }
//        }
//        //对奇数按照降序排列//
//        for(i=0;i<n-1;i++)
//        {
//            for(j=0;j<n-i-1;j++)
//            {
//                if(b[j]<b[j+1])
//                {
//                    t=b[j];
//                    b[j]=b[j+1];
//                    b[j+1]=t;
//                }
//            }
//        }
//        if(m>n)
//        {
//            for(i=0;i<m;i++)
//            {
//                printf("%4d",s[i]);
//            }
//            for(i=0;i<n;i++)
//            {
//                printf("%4d",b[i]);
//            }
//
//        }
//        else if(m<=n)
//        {
//            for(i=0;i<n;i++)
//            {
//                printf("%4d",b[i]);
//            }
//            for(i=0;i<m;i++)
//            {
//                printf("%4d",s[i]);
//            }
//        }
//        return 0;
//    }

//}
