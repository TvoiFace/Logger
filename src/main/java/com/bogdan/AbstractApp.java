package com.bogdan;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 *
 * @author Bogdan
 */

public abstract class AbstractApp
{

    /**
     *
     *
     * @author Bogdan
     */
    public static void main(final String param)
    {

        final Logger log = Logger.getLogger(AbstractApp.class);

        final Hobby[] arr_r = new Hobby[4];

        log.info("Hello, tell me some information about u");

        final Scanner scn = new Scanner(System.in, "UTF-8");

        log.info("What is ur name");
        final String name = scn.nextLine();

        log.info("How old are u?");
        final int age = scn.nextInt();

        log.info("What is ur favourite dish?");
        final String dish = scn.next();

        log.info("How long have u been cooking?");
        final int howlong = scn.nextInt();


        final Hobby obj1 = new Cooking(name, age, dish, howlong);
        final Hobby obj2 = new Cooking("John", 19, "cream soup", 3);

        log.info("What is ur name");
        final String name1 = scn.next();

        log.info("How old are u?");
        final int age1 = scn.nextInt();

        log.info("The height of the largest wave u seen");
        final int high = scn.nextInt();

        log.info("Where are u surfing?");
        final String place = scn.next();

        final Hobby obj3 = new Surfing(name1, age1, high, place);
        final Hobby obj4 = new Surfing("Nick", 19, 5, "Gold Coast");

        arr_r[0] = obj1;
        arr_r[1] = obj2;
        arr_r[2] = obj3;
        arr_r[3] = obj4;


        for (final Hobby b : arr_r)
        {
            try
            {
                b.tellAboutHobby();
            } catch(HobbyException ex)
            {
                log.error("EROR (Age is unreal)");
            }

        }

    }
}

