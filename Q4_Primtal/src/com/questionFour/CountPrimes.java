
package com.questionFour;


class TotalCounter
{
    int count;

    public synchronized void increment()
    {
        count++;
    }
}

public class CountPrimes {

    public static void main(String[] args) throws Exception
    {
        TotalCounter c = new TotalCounter();

        Thread t1 = new Thread(() -> {

            for (int i = 2; i < 350000; i++) {

                boolean isPrimeNumber = true;

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {

                        isPrimeNumber = false;

                    }
                }

                if (isPrimeNumber) {

                    c.increment();

                }

            }
        });

        Thread t2 = new Thread(() -> {

            {

                for (int i = 350001; i < 500000; i++) {

                    boolean isPrimeNumber = true;

                    for (int j = 2; j < i; j++) {

                        if (i % j == 0) {

                            isPrimeNumber = false;

                        }

                    }

                    if (isPrimeNumber) {
                        c.increment();

                    }

                }

            }});

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("The total number of prime numbers between 0 and 500000 is : " + c.count );
    }
}
