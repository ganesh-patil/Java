package MapSortTest;

import java.util.*;

public class SortTreeMap {

    public static void main(String[] args) {
        Map<Integer, String>  testMap = new HashMap<>();
        testMap.put(4,"F");
        testMap.put(5,"FI");
        testMap.put(1,"g");
        testMap.put(6,"F");
        testMap.put(9,"N");
        testMap.put(13,"TH");
        testMap.put(3,"u");
        System.out.println(testMap);
        //printMap(testMap);
        // sort with keys
    /*    Map<Integer, String> testtreemap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        testtreemap.putAll(testMap);*/
//        System.out.println(testtreemap);
        Map<Integer, String>  linkedHashMapTest = new LinkedHashMap<>();

        // Sort by value
        List<Map.Entry<Integer, String>> testList = new ArrayList<Map.Entry<Integer, String>>();
        for(Map.Entry<Integer,String> entry: testMap.entrySet()){
            testList.add(entry);
        }
        Collections.sort(testList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        /*for(Map.Entry<Integer, String> entry : testList){
            linkedHashMapTest.put(entry.getKey(), entry.getValue());
        }*/
        testList.forEach(entry -> linkedHashMapTest.put(entry.getKey(), entry.getValue()));
        System.out.println(linkedHashMapTest);
    }

    public static<K, V> void printMap(Map<K, V> testmap){
        for (Map.Entry<K, V> entry : testmap.entrySet())
        {            System.out.println("Key :"+entry.getKey());
            System.out.println("Value :"+entry.getValue());

        }
    }
}
/*


    Score Finder (100 Marks)
    Praveen is finding a job as a Computer Science teacher in school. He has been rejected many times from different schools but this time he is determined to get the job. He goes to the principal of the school St. Mary.

        The principal says that in his school there is Grading and Credit system.There are N subjects and each subject has a credit Ci attached to it (1 <= i <= N). Each student gets a particular grade in each subject and each grade has a point value which are:

        A = 10,
        A(minus) = 9,
        B = 8,
        B(minus) = 7,
        C = 6,
        C(minus) = 5

        Now if there are 3 subjects of credits 4, 3 and 2 respectively and a particular student scores A(minus), B and C in these 3 subjects respectively then his score would be calculated as follows:
        Total Score=Summation of product of Grade point and corresponding credit of each subject.
        = ( (9*4) + (3*8) + (2*6) ) = 72.

        He wants Praveen to tell total distinct Scores that are possible to be given to a student given credits of N subjects by assigning different grades to each subject.


        Input Format
        First line of input contains an Integer N denoting the size of the array.
        Next N lines of input each containing an Integer denoting the credit Ci of ith subject


        Constraints
        1 <= N <= 100
        1 <= Ci <= 5


        Output Format
        You need to print a single integer denoting the total number of scores that are possible to be given.

        Sample TestCase 1
        Input
        2
        1
        2
        Output
        16
        Explanation
        There are a total of 16 distinct scores that can be achieved (15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 and 30).
        See, the following table for more details :

        Score               Assignment      Calculation

        15                     5 5                    1 x 5   2 x 5 = 15
        16                     6 5                    1 x 6   2 x 5 = 16
        17                     5 6                    1 x 5   2 x 6 = 17
        17                     7 5                    1 x 7   2 x 5 = 17
        18                     6 6                    1 x 6   2 x 6 = 18
        18                     8 5                    1 x 8   2 x 5 = 18
        19                     5 7                    1 x 5   2 x 7 = 19
        19                     7 6                    1 x 7   2 x 6 = 19
        19                     9 5                    1 x 9   2 x 5 = 19
        20                     6 7                    1 x 6   2 x 7 = 20
        20                     8 6                    1 x 8   2 x 6 = 20
        20                     10 5                  1 x 10   2 x 5 = 20
        21                     5 8                    1 x 5   2 x 8 = 21
        21                     7 7                    1 x 7   2 x 7 = 21
        21                     9 6                    1 x 9   2 x 6 = 21
        22                     6 8                    1 x 6   2 x 8 = 22
        22                     8 7                    1 x 8   2 x 7 = 22
        22                     10 6                  1 x 10   2 x 6 = 22
        23                     5 9                    1 x 5   2 x 9 = 23
        23                     7 8                    1 x 7   2 x 8 = 23
        23                     9 7                    1 x 9   2 x 7 = 23
        24                     6 9                    1 x 6   2 x 9 = 24
        24                     8 8                    1 x 8   2 x 8 = 24
        24                     10 7                  1 x 10   2 x 7 = 24
        25                     5 10                  1 x 5   2 x 10 = 25
        25                     7 9                    1 x 7   2 x 9 = 25
        25                     9 8                    1 x 9   2 x 8 = 25
        26                     6 10                  1 x 6   2 x 10 = 26
        26                     8 9                    1 x 8   2 x 9 = 26
        26                     10 8                  1 x 10   2 x 8 = 26
        27                     7 10                  1 x 7   2 x 10 = 27
        27                     9 9                    1 x 9   2 x 9 = 27
        28                     8 10                  1 x 8   2 x 10 = 28
        28                     10 9                  1 x 10   2 x 9 = 28
        29                     9 10                  1 x 9   2 x 10 = 29
        30                     10 10                1 x 10   2 x 10 = 30


        */
/*
         * Enter your code here. Read input from STDIN. Print your output to STDOUT.
         * Your class should be named CandidateCode.
         *//*


        import java.io.*;
        import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        int[] grades = {5,6,7,8,9,10};
        List<Integer> finalScores = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        //Write code here
        int noOfSubjects = in.nextInt();
        int credits[] = new int[noOfSubjects];

        for(int i = 0; i< noOfSubjects; i++){
            credits[i] = in.nextInt();
            //System.out.println(credits[i]);
        }
        //System.out.println(noOfSubjects);
        for(int i= 0; i< grades.length; i++){
            int score  = 0;
            for(int k = 0; k < credits.length; k++){
                score = score+ grades[i]*credits[k];
            }
            if(!finalScores.contains(score)){
                finalScores.add(score);
            }
            for(int j=i+1; j< grades.length; j++){
                //
                int[] temp = new int[credits.length];
                temp[0] = grades[i];
                for(int l =j; i< credits.length.l++){
                    temp[l] = grades[l];
                }
                score = 0;
                for(int k = 0; k < credits.length; k++){
                    score = score+ grades[i]*credits[k];
                }

            }
        }

        System.out.println(finalScores.size());

    }
}
*/
