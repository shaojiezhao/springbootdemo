package com.example.demoservicea.demo;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFuture
{
    public static void main(String[] args)
    {
        Callable<Integer> callable = new Callable<Integer>()
        {
            @Override
            public Integer call() throws Exception
            {
                Thread.sleep(4000);
                System.out.println("call method!");
                return new Random().nextInt();
            }
        };
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();


        try {
            System.out.println(futureTask.get());
            Thread.sleep(1000);

            System.out.println("hello world!");



        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
