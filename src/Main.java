public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!");
        int lowTemperature = 32;
        System.out.println(true || (lowTemperature += 5) > 0);
        System.out.println(true | (lowTemperature += 5) > 0);
        System.out.println(lowTemperature);

        int currentTemperatue = 3;
        int warmThreshold = 60;
        if (currentTemperatue > warmThreshold)
            System.out.println("its warm outside");

        else
            System.out.println("its could outside");

        String windDirection = "west";
        switch (windDirection) {
            case "north":
                System.out.println("the wind is blowing from the north");
                break;
            case "south":
                System.out.println("the wind is blowing from the south");
                break;
            case "east":
                System.out.println("the wind is blowing from the east0");
                break;
            case "west":
                System.out.println("The wind is blowing from the west");
                break;
            default:
                System.out.println("idk where the wind is blowing");
        }

        String words[] = {"hello", "how", "are", "you"};

        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }

        for(String a:words){
            System.out.println(a);
        }


        int j = 10;
        while(j>=0){
            System.out.println(j);
            j--;
        }

        int k = 0;
        do{
            System.out.println(k);
            k+=2;
        }while(k<10);

        int[] integers = {1,2,3,4,-1,-2,10};


        for(int i=0; i<integers.length; i++){
            if (integers[i] <= 0)
                System.out.println(integers[i] + "is negative");
            if (integers[i] >= 0)
                System.out.println(integers[i] + "is positive");
        }



        String name = "joseph";
        System.out.println(name);
        System.out.println(name.substring(1, (name.length()-1) ));



    }


}