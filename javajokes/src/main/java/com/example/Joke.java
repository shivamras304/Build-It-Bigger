package com.example;

import java.util.Random;

//All the jokes are taken from http://www.short-funny.com/index.php

public class Joke {

    String[] jokesCollection = {

            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",

            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "\n" +
                    "Doctor: \"Nine.\"",

            "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.”\n" +
                    "\n" +
                    "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.\"",

            "Anton, do you think I’m a bad mother?\n" +
                    "\n" +
                    "My name is Paul.",

            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",

            "What is the difference between a snowman and a snowwoman?\n" +
                    "-\n" +
                    "Snowballs.",

            "Mother, “How was school today, Patrick?”\n" +
                    "\n" +
                    "Patrick, “It was really great mum! Today we made explosives!”\n" +
                    "\n" +
                    "Mother, “Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?”\n" +
                    "\n" +
                    "Patrick, “What school?\"",

            "\"Mom, where do tampons go?\"\n" +
                    "\n" +
                    "\"Where the babies come from, darling.\"\n" +
                    "\n" +
                    "\"In a stork???!!!\"",

            "Scientists have now discovered how women keep their secrets. They do so within groups of 40.",

            "My wife’s cooking is so bad we usually pray after our food.",

            "Why is it a bad idea for two butt cheeks to get married? Because they part for every little shit.",

            "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?",

            "Police officer: \"Can you identify yourself, sir?\"\n" +
                    " \n" +
                    "Driver pulls out his mirror and says: \"Yes, it's me.\"",

            "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!",

            "A husband and a wife sit at the table, having dinner. The woman drops a bit of tomato sauce on her white top. \"Och, I look like a pig!\" \n" +
                    "\n" +
                    "The man nods, \"And you dropped tomato sauce on your top!\"",

            "When my wife starts to sing I always go out and do some garden work so our neighbors can see there's no domestic violence going on.",

            "\"Mother, why do people die so quickly in our family?\"\n" +
                    "...\n" +
                    "\"Mama?\"\n" +
                    "\"Mama?\"\n" +
                    "\"Maaaammaaaaaaa!\"",

            "What should you put on the tomb stone of a mathematician?\n" +
                    "-\n" +
                    "He didn't count with this...",

            "About 4,000 years ago:\n" +
                    "\n" +
                    "God: I shall create a great plague and every living thing on Earth will die!\n" +
                    "\n" +
                    "Fish: *Winks at God and slips him a $20 note*\n" +
                    "\n" +
                    "God: Correction, I shall create a great flood!",

            "How can you tell you have a really bad case of acne? \n" +
                    "\n" +
                    "It’s when the blind try to read your face.",

            "Q. What’s the worst thing about being lonely?\n" +
                    "\n" +
                    "A. Playing Frisbee.",

            "Me and my wife decided that we don't want to have children anymore. " +
                    "So anybody who wants one can leave us their phone number and address and we will bring you one.",

            "It is so cold outside I saw a politician with his hands in his own pockets.",

            "After many years of studying at a university, I’ve finally become a PhD… or Pizza Hut Deliveryman as people call it.",

            "There is nothing worse than child polio. No wait, there's women's soccer.",

            "Q: Why did the shark keep swimming in circles?\n" +
                    "\n" +
                    "A: It had a nosebleed.",

            "Pessimist: \"Things just can't get any worse!\" \n" +
                    "\n" +
                    "Optimist: \"Nah, of course they can!\"",

            "I wanted to grow my own food but I couldn’t get bacon seeds anywhere.",

            "I was in a restaurant once and I suddenly realized I desperately needed to pass gas. " +
                    "The music was really, really loud, so I timed my reliefs to the beat of the music. " +
                    "After just a few songs I started to feel better. I finished my coffee, " +
                    "and noticed that everybody was staring at me... " +
                    "That was when I remembered I was listening to my iPod.",

            "Why do women live on average two years longer? Because the time they spend parking doesn’t count.",

            "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now.",

            "Woke up with a dead leg this morning. I will not take out a loan with the mafia ever again.",

            "A naked women robbed a bank. Nobody could remember her face.",

            "The 21st century: Deleting history is often more important than making it.",

            "What is short and would be very disturbing at breakfast?\n" +
                    "-\n" +
                    "\"Hitler\"",

            "\"How do you tell that a crab is drunk? It walks forwards.",

            "Do you know what you can hold without ever touching it?\n" +
                    "\n" +
                    "A conversation.",

            "I’ve no home, I haven’t got control, I can’t see any escape. Way past the time I got a new keyboard.",

            "Why do cows wear bells?\n" +
                    " \n" +
                    "Their horns don’t work.",

            "Two grains of sand go through the desert. One to the other: \"I have the feeling somebody is watching me.\"",

            "“You are so kind, funny and beautiful.” \n" +
                    "\n" +
                    "“Oh come on. You just want to get me to bed.” \n" +
                    "\n" +
                    "“And smart, too!”",

            "Q: What do politicians and diapers have in common? \n" +
                    "-\n" +
                    "A: Both should be changed regularly, and both for the same reason.",

            "I’m selling my talking parrot. Why? Because yesterday, the bastard tried to sell me.",

            "Do you know why women aren’t allowed in space? \n" +
                    "-\n" +
                    "To avoid scenarios like: \"Houston, we have a problem!\" \n" +
                    "- \n" +
                    "\"What is the problem?\" \n" +
                    "-\n" +
                    "\"Yeah, great, pretend like you don’t know what I’m talking about!\"",

            "What would you call a very funny mountain? \n" +
                    "-\n" +
                    "Hill Arious\""

    };

    public String getJoke() {
        Random randomGenerator = new Random();

        return jokesCollection[randomGenerator.nextInt(jokesCollection.length)];
    }

}
