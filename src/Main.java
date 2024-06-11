public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            int a = 0;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    a++;
                }
                if(a > 2)
                {
                    break;
                }
            }
            if(a == 2)
            {
                System.out.println(i);
            }
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {
        boolean[] primes = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= 1000; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= 1000; i += p) {
                    primes[i] = false;
                }
            }
        }

        System.out.println("Простые числа до 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
    }
}

 */