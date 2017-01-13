package collazo.albert;


public class ExchangeRate {

        double usd =1;
        double euro = 0.94;
        double bp = 0.82;
        double ir = 68.32;
        double ad = 1.35;
        double cd = 1.32;
        double sd = 1.43;
        double sf = 1.01;
        double mr = 4.47;
        double jy = 115.84;
        double cy = 6.92;

    public String usdToEuro(){

        double d = euro/usd;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String euroToUsd(){

        double d = usd/euro;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String euroToBp(){

        double a = usd/euro;
        double b = usd/bp;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String bpToIr(){

        double a = usd/bp;
        double b = usd/ir;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String irToCd(){

        double a = usd/ir;
        double b = usd/cd;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String cdToSd(){

        double a = usd/cd;
        double b = usd/sd;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String sdToSf(){

        double a = usd/sd;
        double b = usd/sf;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String sfToMr(){

        double a = usd/sf;
        double b = usd/mr;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String mrToJy(){

        double a = usd/mr;
        double b = usd/jy;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public String jyToCy(){

        double a = usd/jy;
        double b = usd/cy;
        double d = a/b;

        String answer = String.format("Exchange is %.2f", d);

        return answer;
    }

    public static void main(String[] args){


    }



    }
