public class Primes {
    public static void main(String[] args) {
        
        boolean[] primeNums = new boolean[Integer.parseInt(args[0]) + 1];
        boolean[] notCrossedArr = new boolean[Integer.parseInt(args[0]) + 1];
        int p = 2, jumps;

        System.out.println("Prime numbers up to " + args[0]);

        for (int i = 2; i < primeNums.length; i++) {
            primeNums[i] = true;
            notCrossedArr[i] = true;
        }

        while (p < Math.sqrt(primeNums.length)) {

            jumps = p;
            notCrossedArr[p] = false;
            p = p + p;

            while (p < primeNums.length) {
                primeNums[p] = false;
                p += jumps;
            }
            p = notCrossed(notCrossedArr);

            if (p == -1) break;
        }

        int countPrime = 0;
        for (int i = 0; i < primeNums.length; i++) {
            if (primeNums[i]) {
                countPrime++;
                System.out.println(i);
            }
        }
        int percent = (countPrime * 100 / (primeNums.length - 1));

        System.out.println("There are " + countPrime + " primes between 2 and " + (primeNums.length - 1) + " (" + percent + "% are primes)");


    }

    // returns the index that was not crossed out already.
    public static int notCrossed(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) return i;
        }
        return -1;
    }
}