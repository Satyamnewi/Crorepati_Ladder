import java.util.*;
class program                                       //Started writing on 28th March, 2016
{                                                   //Completed on 1st April, 2016
    public static void main(String args[])          //1317 lines
    {
        Scanner in=new Scanner(System.in);
        int ch,ch1=0,ch2=0,ch3=0,la=0,lb=0,lc=0,ch4=0,ch5=0,ch6=0,ch7=0,ch8=0,ch9=0,ch10=0,ch11=0,ch12=0,ch13=0;
        int ch14=0,ch15=0,ch16=0,ch17=0,ch18=0,ch19=0,ch20=0,ch21=0,ch22=0,ch23=0,ch24=0,ch25=0,ch26=0,ch27=0;
        int i,j;
        System.out.println("WELCOME TO CROREPATI QUIZ SHOW !!!");
        System.out.println("RULES ARE AS FOLLOWS");
        System.out.println("1. There would be 14 Questions");
        System.out.println("2. You would be given 3 LIFELINES for your assistance, which are :");
        System.out.println("AUDIENCE POLE- For asking audience help on a particular question");
        System.out.println("50-50 -Removes the two uncorrect option from the question");
        System.out.println("EXPERT ADVISE -An expert would give his view about the question");
        System.out.println("If you want to quit the show then press 8");
        System.out.println("Lets Begin The Show: ");
        for(i=20;i<100000;--i);
        for(j=20;j<1000;--j);
        System.out.println();
        System.out.println("Question 1: In India, Kanthari, Kashmiri, Jwala and Dhaani are varities of which spice ?");
        System.out.println("Option are:");
        System.out.println("1. Chilli");
        System.out.println("2. Vanilla");
        System.out.println("3. Cardamom");
        System.out.println("4. Ginger");
        System.out.println("Enter your choice");
        System.out.println("If you need Lifeline then:");
        System.out.println("5. Audience Pole");
        System.out.println("6. 50-50");
        System.out.println("7. Expert Advise");
        System.out.println("8. If you want to Quit ");
        ch=in.nextInt();
        if(ch==6)
        {
            lb++;
            System.out.println("Option are:");
            System.out.println("1. Chilli");
            System.out.println("3. Cardamom");
            System.out.println("Enter your answer");
            ch1=in.nextInt();
            if(ch1==1)
            System.out.println("Right Answer !!!! You won Rs 5,000");
            else
            System.out.println("You have given a wrong answer, the answer should be 1. Chilli");
        }
        else if(ch==5)
        {
            la++;
            System.out.println("1. 85%       2.  2%    3.  9%    4.  4%");
            System.out.println("Enter your answer");
            ch1=in.nextInt();
            if(ch1==1)
            {
                System.out.println("Right Answer !!!! You won Rs 5,000");
            }
            else
            {
                System.out.println("You have given a wrong answer, the answer should be 1. Chilli");
                System.out.println("Sorry you are unable to win any prize");
            }
        }
        else if(ch==7)
        {
            lc++;
            System.out.println("According to my advice the answer should be option 1. Chilli");
            System.out.println("Enter your answer");
            ch1=in.nextInt();
            if(ch1==1)
            {
                System.out.println("Right Answer !!!! You won Rs 5,000");
            }
            else
            {
                System.out.println("You have given a wrong answer, the answer should be 1. Chilli");
                System.out.println("Sorry you are unable to win any prize");
            }
        }
        else if(ch==2||ch==3||ch==4)
        {
            System.out.println("You have given a wrong answer, the answer should be 1. Chilli");
            System.out.println("Sorry you are unable to win any prize");
        }
        else if(ch==1)
        {
            System.out.println("Right Answer !!!! You won Rs 5,000");
        }
        else if(ch==8)
        {
            System.out.println("Now you are out of the game show");
            System.out.println("Sorry you are unable to win any prize");
        }
        if(ch!=8&&(ch1==1||ch==1))
        {
            for(i=20;i<100000;--i);
            for(j=20;j<1000;--j);
            System.out.println();                                   //70 Lines
            System.out.println("Question 2: How many zeroes would you write after one, if you have to write 10 Billion in numerals?");
            System.out.println("Option are:");
            System.out.println("1. Nine");
            System.out.println("2. Ten");
            System.out.println("3. Eight");
            System.out.println("4. Eleven");
            System.out.println("Enter your choice");
            System.out.println("If you need Lifeline then available lifeline are:");
          if(la==0&&lb==0)
          System.out.println("5. Audience Pole      6. 50-50");
          else if(lb==0&&lc==0)
          System.out.println("6. 50-50        7. Expert Advise");
          else if(la==0&&lc==0)
          System.out.println("5. Audience Pole          7. Expert Advise");
          else if(la==0)
          System.out.println("5. Audience Pole");
          else if(lb==0)
          System.out.println("6. 50-50");
          else if(lc==0)
          System.out.println("7. Expert Advise");
          else
          System.out.println("No Lifeline Available");
          System.out.println("8. If you want to Quit ");
          ch2=in.nextInt();
          if(ch!=5&&ch2==5)
          {
             la++;
             System.out.println("1. 10%       2.  80%   3. 6%     4.  4%");
             System.out.println("Enter your answer");
             ch3=in.nextInt();
             if(ch3==2)
             {
                 System.out.println("Right Answer !!!! You won Rs 10,000");
             }
             else
             {
                System.out.println("You have given a wrong answer, the answer should be 2. Ten");
                System.out.println("Total prize money won by you is: Rs 5,000");
             }
          }
          else if(ch!=6&&ch2==6)
          {
              lb++;
              System.out.println("Option are:");
              System.out.println("1. Nine");
              System.out.println("2. Ten");
              System.out.println("Enter your answer");
              ch3=in.nextInt();
              if(ch3==2)
              {
                  System.out.println("Right Answer !!!! You won Rs 10,000");
              }
              else
              {
                  System.out.println("You have given a wrong answer, the answer should be 2. Ten");
                  System.out.println("Total prize money won by you is: Rs 5,000");
              }
          }
          else if(ch!=7&&ch2==7)
          {
            lc++;
            System.out.println("According to my advice the answer should be option 2. Ten");
            System.out.println("Enter your answer");
            ch3=in.nextInt();
            if(ch3==2)
            {
                System.out.println("Right Answer !!!! You won Rs 10,000");
            }
            else
            {
                System.out.println("You have given a wrong answer, the answer should be 2. Ten");
                System.out.println("Total prize money won by you is: Rs 5,000");
            }
          }
          else if(ch2==2)
          {
            System.out.println("Right Answer !!!! You won Rs 10,000");
          }
          else if(ch2==1||ch2==3||ch2==4)
          {
            System.out.println("You have given a wrong answer, the answer should be 2. Ten");
            System.out.println("Total prize money won by you is: Rs 5,000");
          }
          else if(ch2==8)
          {
            System.out.println("Now you are out of the game show");
            System.out.println("Total prize money won by you is: Rs 5,000");
          }
          if(ch2!=8&&(ch2==2||ch3==2))
          {
            for(i=20;i<100000;--i);
            for(j=20;j<1000;--j);
             System.out.println();                                  //68 lines
             System.out.println("Question 3: Which Indian Banknote has the picture of a farmer ploughing the field?");
             System.out.println("Option are:");
             System.out.println("1. Rs 5");
             System.out.println("2. Rs 20");
             System.out.println("3. Rs 100");
             System.out.println("4. Rs 500");
             System.out.println("Enter your choice");
             System.out.println("If you need Lifeline then, available lifeline are:");
             if(la==0&&lb==0)
             System.out.println("5. Audience Pole      6. 50-50");
             else if(lb==0&&lc==0)
             System.out.println("6. 50-50        7. Expert Advise");
             else if(la==0&&lc==0)
             System.out.println("5. Audience Pole          7. Expert Advise");
             else if(la==0)
             System.out.println("5. Audience Pole");
             else if(lb==0)
             System.out.println("6. 50-50");
             else if(lc==0)
             System.out.println("7. Expert Advise");
             else
             System.out.println("No Lifeline Available");
             System.out.println("8. If you want to Quit ");
             ch4=in.nextInt();
             if(la==0&&ch4==5)
             {
                la++;
                System.out.println("1. 60%       2.  5%   3. 20%     4.  15%");
                System.out.println("Enter your answer");
                ch5=in.nextInt();
                if(ch5==1)
                {
                System.out.println("Right Answer !!!! You won Rs 25,000");
                }
                else
                {
                   System.out.println("You have given a wrong answer, the answer should be 1. Rs 5");
                   System.out.println("Total prize money won by you is: Rs 10,000");
                }
             }
             else if(lb==0&&ch4==6)
             {
                 lb++;
                 System.out.println("Option are:");
                 System.out.println("1. Rs 5");
                 System.out.println("4. Rs 500");
                 System.out.println("Enter your answer");
                 ch5=in.nextInt();
                 if(ch5==1)
                 {
                     System.out.println("Right Answer !!!! You won Rs 25,000");
                 }
                 else
                 {
                     System.out.println("You have given a wrong answer, the answer should be 1. Rs 5");
                     System.out.println("Total prize money won by you is: Rs 10,000");
                 }
             }
             else if(lc==0&&ch4==7)
             {
                 lc++;
                 System.out.println("According to my advice the answer should be option 1. Rs 5");
                 System.out.println("Enter your answer");
                 ch5=in.nextInt();
                 if(ch5==1)
                 {
                     System.out.println("Right Answer !!!! You won Rs 25,000");
                 }
                 else
                 {
                     System.out.println("You have given a wrong answer, the answer should be 1. Rs 5");
                     System.out.println("Total prize money won by you is: Rs 10,000");
                 }
             }
             else if(ch4==1)
             {
                 System.out.println("Right Answer !!!! You won Rs 25,000");
             }
             else if(ch4==2||ch4==3||ch4==4)
             {
                 System.out.println("You have given a wrong answer, the answer should be 1. Rs 5");
                 System.out.println("Total prize money won by you is: Rs 10,000");
             }
             else if(ch4==8)
             {
                System.out.println("Now you are out of the game show");
                System.out.println("Total prize money won by you is: Rs 10,000");
             }
             if(ch4!=8&&(ch4==1||ch5==1))
             {
                for(i=20;i<100000;--i);
                for(j=20;j<1000;--j);
                System.out.println();                                        // 68 lines
                System.out.println("Question 4: How many squares/spaces are on a chess Board?");
                System.out.println("Option are:");
                System.out.println("1. 49");
                System.out.println("2. 64");
                System.out.println("3. 81");
                System.out.println("4. 100");
                System.out.println("Enter your choice");
                System.out.println("If you need Lifeline then available lifeline are:");
                if(la==0&&lb==0)
                System.out.println("5. Audience Pole      6. 50-50");
                else if(lb==0&&lc==0)
                System.out.println("6. 50-50        7. Expert Advise");
                else if(la==0&&lc==0)
                System.out.println("5. Audience Pole          7. Expert Advise");
                else if(la==0)
                System.out.println("5. Audience Pole");
                else if(lb==0)
                System.out.println("6. 50-50");
                else if(lc==0)
                System.out.println("7. Expert Advise");
                else
                System.out.println("No Lifeline Available");
                System.out.println("8. If you want to Quit ");
                ch6=in.nextInt();
                if(ch6==5&&la==0)
                {
                    la++;
                    System.out.println("1. 5%       2.  60%   3. 5%     4.  30%");
                    System.out.println("Enter your answer");
                    ch7=in.nextInt();
                    if(ch7==2)
                    {
                        System.out.println("Right Answer !!!! You won Rs 50,000");
                    }
                    else
                    {
                    System.out.println("You have given a wrong answer, the answer should be 2. 64");
                    System.out.println("Total prize money won by you is: Rs 25,000");
                    }
                }
                else if(ch6==6&&lb==0)
                {
                    lb++;
                    System.out.println("Option are:");
                    System.out.println("2. 64");
                    System.out.println("4. 100");
                    System.out.println("Enter your answer");
                    ch7=in.nextInt();
                    if(ch7==2)
                    {
                    System.out.println("Right Answer !!!! You won Rs 50,000");
                    }
                    else
                    {
                    System.out.println("You have given a wrong answer, the answer should be 2. 64");
                    System.out.println("Total prize money won by you is: Rs 25,000");
                    }
                }
                else if(lc==0&&ch6==7)
                {
                    lc++;
                    System.out.println("According to my advice the answer should be option 2. 64");
                    System.out.println("Enter your answer");
                    ch7=in.nextInt();
                    if(ch7==2)
                    {
                        System.out.println("Right Answer !!!! You won Rs 50,000");
                    }
                    else
                    {
                       System.out.println("You have given a wrong answer, the answer should be 2. 64");
                       System.out.println("Total prize money won by you is: Rs 25,000");
                    }
                }
                else if(ch6==2)
                {
                    System.out.println("Right Answer !!!! You won Rs 50,000");
                }
                else if(ch6==1||ch6==3||ch6==4)
                {
                    System.out.println("You have given a wrong answer, the answer should be 2. 64");
                    System.out.println("Total prize money won by you is: Rs 25,000");
                }
                else if(ch6==8)
                {
                   System.out.println("Now you are out of the game show");
                   System.out.println("Total prize money won by you is: Rs 25,000");
                }
                if(ch6!=8&&(ch6==2||ch7==2))
                {
                    for(i=20;i<100000;--i);
                    for(j=20;j<1000;--j);
                    System.out.println();
                    System.out.println("Question 5: In Roman Numerals, what does 'XL' stand for ");
                    System.out.println("Option are:");
                    System.out.println("1. 30");
                    System.out.println("2. 40");
                    System.out.println("3. 50");
                    System.out.println("4. 60");
                    System.out.println("Enter your choice");
                    System.out.println("If you need Lifeline then available lifeline are:");
                    if(la==0&&lb==0)
                    System.out.println("5. Audience Pole      6. 50-50");
                    else if(lb==0&&lc==0)
                    System.out.println("6. 50-50        7. Expert Advise");
                    else if(la==0&&lc==0)
                    System.out.println("5. Audience Pole          7. Expert Advise");
                    else if(la==0)
                    System.out.println("5. Audience Pole");
                    else if(lb==0)
                    System.out.println("6. 50-50");
                    else if(lc==0)
                    System.out.println("7. Expert Advise");
                    else
                    System.out.println("No Lifeline Available");
                    System.out.println("8. If you want to Quit ");
                    ch8=in.nextInt();
                    if(ch8==5&&la==0)
                    {
                       la++;
                       System.out.println("1. 2%       2.  92%   3. 3%     4.  3%");
                       System.out.println("Enter your answer");
                       ch9=in.nextInt();
                       if(ch9==2)
                       {
                           System.out.println("Right Answer !!!! You won Rs 1,20,000");
                       }
                       else
                       {
                          System.out.println("You have given a wrong answer, the answer should be 2. 40");
                          System.out.println("Total prize money won by you is: Rs 50,000");
                       }
                    }
                    else if(ch8==6&&lb==0)
                    {
                       lb++;
                       System.out.println("Option are:");
                       System.out.println("2. 40");
                       System.out.println("3. 50");
                       System.out.println("Enter your answer");
                       ch9=in.nextInt();
                       if(ch9==2)
                       {
                            System.out.println("Right Answer !!!! You won Rs 1,20,000");
                       }
                       else
                       {
                            System.out.println("You have given a wrong answer, the answer should be 2. 40");
                            System.out.println("Total prize money won by you is: Rs 50,000");
                       }
                    }
                    else if(lc==0&&ch8==7)
                    {
                       lc++;
                       System.out.println("According to my advice the answer should be option 2. 40");
                       System.out.println("Enter your answer");
                       ch9=in.nextInt();
                       if(ch9==2)
                       {
                          System.out.println("Right Answer !!!! You won Rs 1,20,000");
                       }
                       else
                       {
                       System.out.println("You have given a wrong answer, the answer should be 2. 40");
                       System.out.println("Total prize money won by you is: Rs 50,000");
                       }
                    }
                    else if(ch8==2)
                    {
                        System.out.println("Right Answer !!!! You won Rs 1,20,000");
                    }
                    else if(ch8==1||ch8==3||ch8==4)
                    {
                        System.out.println("You have given a wrong answer, the answer should be 2. 40");
                        System.out.println("Total prize money won by you is: Rs 50,000");
                    }
                    else if(ch8==8)
                    {
                        System.out.println("Now you are out of the game show");
                        System.out.println("Total prize money won by you is: Rs 50,000");
                    }
                    if(ch8!=8&&(ch8==2||ch9==2))
                    {
                        for(i=20;i<100000;--i);
                        for(j=20;j<1000;--j);
                        System.out.println();
                        System.out.println("Question 6: Which country has special tea houses and is famous for it's various tea ceromonies");
                        System.out.println("Option are:");
                        System.out.println("1. China");
                        System.out.println("2. Brazil");
                        System.out.println("3. Singapore");
                        System.out.println("4. Japan");
                        System.out.println("Enter your choice");
                        System.out.println("If you need Lifeline then available lifeline are:");
                        if(la==0&&lb==0)
                        System.out.println("5. Audience Pole      6. 50-50");
                        else if(lb==0&&lc==0)
                        System.out.println("6. 50-50        7. Expert Advise");
                        else if(la==0&&lc==0)
                        System.out.println("5. Audience Pole          7. Expert Advise");
                        else if(la==0)
                        System.out.println("5. Audience Pole");
                        else if(lb==0)
                        System.out.println("6. 50-50");
                        else if(lc==0)
                        System.out.println("7. Expert Advise");
                        else
                        System.out.println("No Lifeline Available");
                        System.out.println("8. If you want to Quit ");
                        ch10=in.nextInt();
                        if(ch10==5&&la==0)
                        {
                           la++;
                           System.out.println("1. 30%       2.  18%   3. 2%     4.  50%");
                           System.out.println("Enter your answer");
                           ch11=in.nextInt();
                           if(ch11==4)
                           {
                               System.out.println("Right Answer !!!! You won Rs 2,50,000");
                           }
                           else
                           {
                              System.out.println("You have given a wrong answer, the answer should be 4. Japan");
                              System.out.println("Total prize money won by you is: Rs 1 Lakh");
                           }
                        }
                        else if(ch10==6&&lb==0)
                        {
                            lb++;
                            System.out.println("Option are:");
                            System.out.println("2. Brazil");
                            System.out.println("4. Japan");
                            System.out.println("Enter your answer");
                            ch11=in.nextInt();
                            if(ch11==4)
                            {
                                System.out.println("Right Answer !!!! You won Rs 2.5 Lakh");
                            }
                            else
                            {
                                System.out.println("You have given a wrong answer, the answer should be 4. Japan");
                                System.out.println("Total prize money won by you is: Rs 1 Lakh");
                            }
                        }
                        else if(ch10==7&&lc==0)
                        {
                            lc++;
                            System.out.println("According to my advice the answer should be option 2. 40");
                            System.out.println("Enter your answer");
                            ch11=in.nextInt();
                            if(ch11==4)
                            {
                                System.out.println("Right Answer !!!! You won Rs 2.5 Lakh");
                            }
                            else
                            {
                               System.out.println("You have given a wrong answer, the answer should be 4. Japan");
                               System.out.println("Total prize money won by you is: Rs 1 Lakh");
                            }
                        }
                        else if(ch10==4)
                        {
                            System.out.println("Right Answer !!!! You won Rs 2.5 Lakh");
                        }
                        else if(ch10==1||ch10==2||ch10==3)
                        {
                            System.out.println("You have given a wrong answer, the answer should be 4. Japan");
                            System.out.println("Total prize money won by you is: Rs 1 Lakh");
                        }
                        else if(ch10==8)
                        {
                           System.out.println("Now you are out of the game show");
                           System.out.println("Total prize money won by you is: Rs 1 Lakh");
                        }
                        if(ch10!=8&&(ch10==4||ch11==4))
                        {
                           for(i=20;i<100000;--i);
                           for(j=20;j<1000;--j);
                           System.out.println();
                           System.out.println("Question 7: In 'Ali Baba and the Forty Thieves' what was Ali Baba's profession");
                           System.out.println("Option are:");
                           System.out.println("1. Milkman");
                           System.out.println("2. Cobbler");
                           System.out.println("3. Goldsmith");
                           System.out.println("4. Woodcutter");
                           System.out.println("Enter your choice");
                           System.out.println("If you need Lifeline then available lifeline are:");
                           if(la==0&&lb==0)
                           System.out.println("5. Audience Pole      6. 50-50");
                           else if(lb==0&&lc==0)
                           System.out.println("6. 50-50        7. Expert Advise");
                           else if(la==0&&lc==0)
                           System.out.println("5. Audience Pole          7. Expert Advise");
                           else if(la==0)
                           System.out.println("5. Audience Pole");
                           else if(lb==0)
                           System.out.println("6. 50-50");
                           else if(lc==0)
                           System.out.println("7. Expert Advise");
                           else
                           System.out.println("No Lifeline Available");
                           System.out.println("8. If you want to Quit ");
                           ch12=in.nextInt();
                           if(ch12==5&&la==0)
                           {
                              la++;
                              System.out.println("1. 3%       2. 2%   3. 45%     4.  50%");
                              System.out.println("Enter your answer");
                              ch13=in.nextInt();
                              if(ch13==4)
                              {
                                  System.out.println("Right Answer !!!! You won Rs 5 Lakh");
                              }
                              else
                              {
                                 System.out.println("You have given a wrong answer, the answer should be 4. Woodcutter");
                                 System.out.println("Total prize money won by you is: Rs 2.5 Lakh");
                              }
                           }
                           else if(ch12==6&&lb==0)
                           {
                               lb++;
                               System.out.println("Option are:");
                               System.out.println("3. Goldsmith");
                               System.out.println("4. Woodcutter");
                               System.out.println("Enter your answer");
                               ch13=in.nextInt();
                               if(ch13==4)
                               {
                                   System.out.println("Right Answer !!!! You won Rs 5 Lakh");
                               }
                               else
                               {
                                  System.out.println("You have given a wrong answer, the answer should be 4. Woodcutter");
                                  System.out.println("Total prize money won by you is: Rs 2.5 Lakh");
                               }
                           }
                           else if(ch12==7&&lc==0)
                           {
                               lc++;
                               System.out.println("I don't know the answer but I definetly think that it should be either Goldsmith or Woodcutter");
                               System.out.println("Enter your answer");
                               ch13=in.nextInt();
                               if(ch13==4)
                               {
                                   System.out.println("Right Answer !!!! You won Rs 5 Lakh");
                               }
                               else
                               {
                                  System.out.println("You have given a wrong answer, the answer should be 4. Woodcutter");
                                  System.out.println("Total prize money won by you is: Rs 2.5 Lakh");
                               }
                           }
                           else if(ch12==4)
                           {
                               System.out.println("Right Answer !!!! You won Rs 5 Lakh");
                           }
                           else if(ch12==1||ch12==2||ch12==3)
                           {  
                               System.out.println("You have given a wrong answer, the answer should be 4. Woodcutter");
                               System.out.println("Total prize money won by you is: Rs 2.5 Lakh");
                           }
                           else if(ch12==8)
                           {
                              System.out.println("Now you are out of the game show");
                              System.out.println("Total prize money won by you is: Rs 2.5 Lakh");
                           }
                           if(ch12!=8&&(ch12==4||ch13==4))
                           {
                              for(i=20;i<100000;--i);
                              for(j=20;j<1000;--j);
                              System.out.println();
                              System.out.println("Question 8: The world heritage site of Petra is located in which country");
                              System.out.println("Option are:");
                              System.out.println("1. Peru");
                              System.out.println("2. Jordan");
                              System.out.println("3. Italy");
                              System.out.println("4. Mexico");
                              System.out.println("Enter your choice");
                              System.out.println("If you need Lifeline then available lifeline are:");
                              if(la==0&&lb==0)
                              System.out.println("5. Audience Pole      6. 50-50");
                              else if(lb==0&&lc==0)
                              System.out.println("6. 50-50        7. Expert Advise");
                              else if(la==0&&lc==0)
                              System.out.println("5. Audience Pole          7. Expert Advise");
                              else if(la==0)
                              System.out.println("5. Audience Pole");
                              else if(lb==0)
                              System.out.println("6. 50-50");
                              else if(lc==0)
                              System.out.println("7. Expert Advise");
                              else
                              System.out.println("No Lifeline Available");
                              System.out.println("8. If you want to Quit ");
                              ch14=in.nextInt();
                              if(ch14==5&&la==0)
                              {
                                 la++;
                                 System.out.println("1. 4%       2. 60%   3. 30%     4.  6%");
                                 System.out.println("Enter your answer");
                                 ch15=in.nextInt();
                                 if(ch15==2)
                                 {
                                     System.out.println("Right Answer !!!! You won Rs 10 Lakh");
                                 }
                                 else
                                 {
                                    System.out.println("You have given a wrong answer, the answer should be 2. Jordan");
                                    System.out.println("Total prize money won by you is: Rs 5 Lakh");
                                 }
                              }
                              else if(ch14==6&&lb==0)
                              {
                                  lb++;
                                  System.out.println("Option are:");
                                  System.out.println("2. Jordan");
                                  System.out.println("3. Italy");
                                  System.out.println("Enter your answer");
                                  ch15=in.nextInt();
                                  if(ch15==2)
                                  { 
                                      System.out.println("Right Answer !!!! You won Rs 10 Lakh");
                                  }
                                  else
                                  {
                                     System.out.println("You have given a wrong answer, the answer should be 2. Jordan");
                                     System.out.println("Total prize money won by you is: Rs 5 Lakh");
                                  }
                              }
                              else if(ch14==7&&lc==0)
                              {
                                  lc++;
                                  System.out.println("According to me the answer should be 2. Jordan");
                                  System.out.println("Enter your answer");
                                  ch15=in.nextInt();
                                  if(ch15==2)
                                  {
                                      System.out.println("Right Answer !!!! You won Rs 10 Lakh");
                                  }
                                  else
                                  {
                                      System.out.println("You have given a wrong answer, the answer should be 2. Jordan");
                                      System.out.println("Total prize money won by you is: Rs 5 Lakh");
                                  }
                              }
                              else if(ch14==2)
                              {
                                  System.out.println("Right Answer !!!! You won Rs 10 Lakh");
                              }
                              else if(ch14==1||ch14==3||ch14==4)
                              {  
                                  System.out.println("You have given a wrong answer, the answer should be 2. Jordan");
                                  System.out.println("Total prize money won by you is: Rs 5 Lakh");
                              }
                              else if(ch14==8)
                              {
                                  System.out.println("Now you are out of the game show");
                                  System.out.println("Total prize money won by you is: Rs 5 Lakh");
                              }
                              if(ch14!=8&&(ch14==2||ch15==2))
                              {
                                  for(i=20;i<100000;--i);
                                  for(j=20;j<1000;--j);
                                  System.out.println();
                                  System.out.println("Question 9: According to Hindu Mythology, what did Lord Brahma create from Agni, Vaayu and Ravi");
                                  System.out.println("Option are:");
                                  System.out.println("1. The first three vedas");
                                  System.out.println("2. Tripura");
                                  System.out.println("3. Shiva's Trishul");
                                  System.out.println("4. Saraswati, Lakshmi and Kali");
                                  System.out.println("Enter your choice");
                                  System.out.println("If you need Lifeline then available lifeline are:");
                                  if(la==0&&lb==0)
                                  System.out.println("5. Audience Pole      6. 50-50");
                                  else if(lb==0&&lc==0)
                                  System.out.println("6. 50-50        7. Expert Advise");
                                  else if(la==0&&lc==0)
                                  System.out.println("5. Audience Pole          7. Expert Advise");
                                  else if(la==0)
                                  System.out.println("5. Audience Pole");
                                  else if(lb==0)
                                  System.out.println("6. 50-50");
                                  else if(lc==0)
                                  System.out.println("7. Expert Advise");
                                  else
                                  System.out.println("No Lifeline Available");
                                  System.out.println("8. If you want to Quit ");
                                  ch16=in.nextInt();
                                  if(ch16==5&&la==0)
                                  {
                                     la++;
                                     System.out.println("1. 4%       2. 60%   3. 30%     4.  6%");
                                     System.out.println("Enter your answer");
                                     ch17=in.nextInt();
                                     if(ch17==1)
                                     {
                                         System.out.println("Right Answer !!!! You won Rs 25 Lakh");
                                     }
                                     else
                                     {
                                        System.out.println("You have given a wrong answer, the answer should be 1. The first three vedas ");
                                        System.out.println("Total prize money won by you is: Rs 10 Lakh");
                                     }
                                  }
                                  else if(ch16==6&&lb==0)
                                  {
                                      lb++;
                                      System.out.println("Option are:");
                                      System.out.println("1. The first three vedas");
                                      System.out.println("3. Shiva's Trishul");
                                      System.out.println("Enter your answer");
                                      ch17=in.nextInt();
                                      if(ch17==1)
                                      { 
                                          System.out.println("Right Answer !!!! You won Rs 25 Lakh");
                                      }
                                      else
                                      {
                                          System.out.println("You have given a wrong answer, the answer should be 1. The first three vedas");
                                          System.out.println("Total prize money won by you is: Rs 10 Lakh");
                                      }
                                  }
                                  else if(ch16==7&&lc==0)
                                  {
                                      lc++;
                                      System.out.println("According to me the answer should be 1. The first three vedas");
                                      System.out.println("Enter your answer");
                                      ch17=in.nextInt();
                                      if(ch17==1)
                                      {
                                           System.out.println("Right Answer !!!! You won Rs 25 Lakh");
                                      }
                                      else
                                      {
                                           System.out.println("You have given a wrong answer, the answer should be 1. The first three vedas");
                                           System.out.println("Total prize money won by you is: Rs 10 Lakh");
                                      }
                                  }
                                  else if(ch16==1)
                                  {
                                       System.out.println("Right Answer !!!! You won Rs 25 Lakh");
                                  }
                                  else if(ch16==2||ch16==3||ch16==4)
                                  {  
                                       System.out.println("You have given a wrong answer, the answer should be 1. The first three vedas ");
                                       System.out.println("Total prize money won by you is: Rs 10 Lakh");
                                  }
                                  else if(ch16==8)
                                  {
                                       System.out.println("Now you are out of the game show");
                                       System.out.println("Total prize money won by you is: Rs 10 Lakh");
                                  }
                                  if(ch16!=8&&(ch16==1||ch17==1))
                                  {
                                      for(i=20;i<100000;--i);
                                      for(j=20;j<1000;--j);
                                      System.out.println();
                                      System.out.println("Question 10: Which novel is based on the life of William Dampier who sailed around the Globe three times");
                                      System.out.println("Option are:");
                                      System.out.println("1. Around the World in 80 Days");
                                      System.out.println("2. Gulliver's Travel");
                                      System.out.println("3. The Three Musketeers");
                                      System.out.println("4. Black Beauty");
                                      System.out.println("Enter your choice");
                                      System.out.println("If you need Lifeline then available lifeline are:");
                                      if(la==0&&lb==0)
                                      System.out.println("5. Audience Pole      6. 50-50");
                                      else if(lb==0&&lc==0)
                                      System.out.println("6. 50-50        7. Expert Advise");
                                      else if(la==0&&lc==0)
                                      System.out.println("5. Audience Pole          7. Expert Advise");
                                      else if(la==0)
                                      System.out.println("5. Audience Pole");
                                      else if(lb==0)
                                      System.out.println("6. 50-50");
                                      else if(lc==0)
                                      System.out.println("7. Expert Advise");
                                      else
                                      System.out.println("No Lifeline Available");
                                      System.out.println("8. If you want to Quit ");
                                      ch18=in.nextInt();
                                      if(ch18==5&&la==0)
                                      {
                                          la++;
                                          System.out.println("1. 10%       2. 70%   3. 8%     4.  12%");
                                          System.out.println("Enter your answer");
                                          ch19=in.nextInt();
                                          if(ch19==2)
                                          {
                                              System.out.println("Right Answer !!!! You won Rs 50 Lakh");
                                          }
                                          else
                                          {
                                              System.out.println("You have given a wrong answer, the answer should be 2. Gulliver's Travels");
                                              System.out.println("Total prize money won by you is: Rs 25 Lakh");
                                          }
                                      }
                                      else if(ch18==6&&lb==0)
                                      {
                                          lb++;
                                          System.out.println("Option are:");
                                          System.out.println("2. Gulliver's Travel");
                                          System.out.println("4. Black Beauty");
                                          System.out.println("Enter your answer");
                                          ch19=in.nextInt();
                                          if(ch19==2)
                                          { 
                                              System.out.println("Right Answer !!!! You won Rs 50 Lakh");
                                          }
                                          else
                                          {
                                              System.out.println("You have given a wrong answer, the answer should be 2. Gulliver's Travels");
                                              System.out.println("Total prize money won by you is: Rs 25 Lakh");
                                          }
                                      }
                                      else if(ch18==7&&lc==0)
                                      {
                                          lc++;
                                          System.out.println("According to me the answer should be 2. Gulliver's Travels");
                                          System.out.println("Enter your answer");
                                          ch19=in.nextInt();
                                          if(ch19==2)
                                          {
                                              System.out.println("Right Answer !!!! You won Rs 50 Lakh");
                                          }
                                          else
                                          {
                                              System.out.println("You have given a wrong answer, the answer should be 2. Gulliver's Travels");
                                              System.out.println("Total prize money won by you is: Rs 25 Lakh");
                                          }
                                      }
                                      else if(ch18==2)
                                      {
                                           System.out.println("Right Answer !!!! You won Rs 50 Lakh");
                                      }
                                      else if(ch18==1||ch18==3||ch18==4)
                                      {  
                                          System.out.println("You have given a wrong answer, the answer should be 2. Gulliver's Travels");
                                          System.out.println("Total prize money won by you is: Rs 25 Lakh");
                                      }
                                      else if(ch18==8)
                                      {
                                          System.out.println("Now you are out of the game show");
                                          System.out.println("Total prize money won by you is: Rs 25 Lakh");
                                      }
                                      if(ch18!=8&&(ch18==2||ch19==2))
                                      {
                                          for(i=20;i<100000;--i);
                                          for(j=20;j<1000;--j);
                                          System.out.println();
                                          System.out.println("Question 11: Which political person is the author of the Book JUDO: History, Theory, Practice ?");
                                          System.out.println("Option are:");
                                          System.out.println("1. Vladimir Putin");
                                          System.out.println("2. Hilary Clinton");
                                          System.out.println("3. Chou En Lai");
                                          System.out.println("4. Barack Obama");
                                          System.out.println("Enter your choice");
                                          System.out.println("If you need Lifeline then available lifeline are:");
                                          if(la==0&&lb==0)
                                          System.out.println("5. Audience Pole      6. 50-50");
                                          else if(lb==0&&lc==0)
                                          System.out.println("6. 50-50        7. Expert Advise");
                                          else if(la==0&&lc==0)
                                          System.out.println("5. Audience Pole          7. Expert Advise");
                                          else if(la==0)
                                          System.out.println("5. Audience Pole");
                                          else if(lb==0)
                                          System.out.println("6. 50-50");
                                          else if(lc==0)
                                          System.out.println("7. Expert Advise");
                                          else
                                          System.out.println("No Lifeline Available");
                                          System.out.println("8. If you want to Quit ");
                                          ch20=in.nextInt();
                                          if(ch20==5&&la==0)
                                          {
                                              la++;
                                              System.out.println("1. 45%       2. 3%   3. 45%     4.  7%");
                                              System.out.println("Enter your answer");
                                              ch21=in.nextInt();
                                              if(ch21==1)
                                              {
                                                  System.out.println("Right Answer !!!! You won ******* Rs 1 Crore *******");
                                              }
                                              else
                                              {
                                                  System.out.println("You have given a wrong answer, the answer should be 1. Vladimir Putin");
                                                  System.out.println("Total prize money won by you is: Rs 50 Lakh");
                                              }
                                          }
                                          else if(ch20==6&&lb==0)
                                          {
                                              lb++;
                                              System.out.println("Option are:");
                                              System.out.println("1. Vladimir Putin");
                                              System.out.println("3. Chou En Lai");
                                              System.out.println("Enter your answer");
                                              ch21=in.nextInt();
                                              if(ch21==1)
                                              { 
                                                  System.out.println("Right Answer !!!! You won ******Rs 1 Crore******");
                                              }
                                              else
                                              {
                                                  System.out.println("You have given a wrong answer, the answer should be 1. Vladimir Putin");
                                                  System.out.println("Total prize money won by you is: Rs 50 Lakh");
                                              }
                                          }
                                          else if(ch20==7&&lc==0)
                                          {
                                             lc++;
                                             System.out.println("According to me the answer should be 1. Vladimir Putin");
                                             System.out.println("Enter your answer");
                                             ch21=in.nextInt();
                                             if(ch21==1)
                                             {
                                                 System.out.println("Right Answer !!!! You won ******Rs 1 Crore******");
                                             }
                                             else
                                             {
                                                 System.out.println("You have given a wrong answer, the answer should be 1. Vladimir Putin");
                                                 System.out.println("Total prize money won by you is: Rs 50 Lakh");
                                             }
                                          }
                                          else if(ch20==1)
                                          {
                                               System.out.println("Right Answer !!!! You won ******Rs 1 Crore******");
                                          }
                                          else if(ch20==2||ch20==3||ch20==4)
                                          {  
                                              System.out.println("You have given a wrong answer, the answer should be 1. Vladimir Putin");
                                              System.out.println("Total prize money won by you is: Rs 50 Lakh");
                                          }
                                          else if(ch20==8)
                                          {
                                             System.out.println("Now you are out of the game show");
                                             System.out.println("Total prize money won by you is: Rs 50 Lakh");
                                          }
                                          if(ch20!=8&&(ch20==1||ch21==1))
                                          {
                                              for(i=20;i<100000;--i);
                                              for(j=20;j<1000;--j);
                                              System.out.println();
                                              System.out.println("Question 12: In 1963, Doughlas Engelbart created the first working model of something.Twenty years later, what was mass produced using his idea?");
                                              System.out.println("Option are:");
                                              System.out.println("1. Mobile Phone");
                                              System.out.println("2. Ice tea");
                                              System.out.println("3. Computer mouse");
                                              System.out.println("4. Computer Keyboard");
                                              System.out.println("Enter your choice");
                                              System.out.println("If you need Lifeline then available lifeline are:");
                                              if(la==0&&lb==0)
                                              System.out.println("5. Audience Pole      6. 50-50");
                                              else if(lb==0&&lc==0)
                                              System.out.println("6. 50-50        7. Expert Advise");
                                              else if(la==0&&lc==0)
                                              System.out.println("5. Audience Pole          7. Expert Advise");
                                              else if(la==0)
                                              System.out.println("5. Audience Pole");
                                              else if(lb==0)
                                              System.out.println("6. 50-50");
                                              else if(lc==0)
                                              System.out.println("7. Expert Advise");
                                              else
                                              System.out.println("No Lifeline Available");
                                              System.out.println("8. If you want to Quit ");
                                              ch22=in.nextInt();
                                              if(ch22==5&&la==0)
                                              {
                                                  la++;
                                                  System.out.println("1. 7%       2. 3%   3. 45%     4.  45%");
                                                  System.out.println("Enter your answer");
                                                  ch23=in.nextInt();
                                                  if(ch23==3)
                                                  {
                                                      System.out.println("Right Answer !!!! You won ******* Rs 3 Crore *******");
                                                  }
                                                  else
                                                  {
                                                      System.out.println("You have given a wrong answer, the answer should be 3. Computer mouse");
                                                      System.out.println("Total prize money won by you is: Rs 1 Crore");
                                                  }
                                              }
                                              else if(ch22==6&&lb==0)
                                              {
                                                  lb++;
                                                  System.out.println("Option are:");
                                                  System.out.println("3. Computer mouse");
                                                  System.out.println("4. Computer keyboard");
                                                  System.out.println("Enter your answer");
                                                  ch23=in.nextInt();
                                                  if(ch23==3)
                                                  { 
                                                      System.out.println("Right Answer !!!! You won ******Rs 3 Crore******");
                                                  }
                                                  else
                                                  {
                                                      System.out.println("You have given a wrong answer, the answer should be 3. Computer mouse");
                                                      System.out.println("Total prize money won by you is: Rs 1 Crore");
                                                  }
                                              }
                                              else if(ch22==7&&lc==0)
                                              {
                                                  lc++;
                                                  System.out.println("According to me the answer should be 3. Computer mouse");
                                                  System.out.println("Enter your answer");
                                                  ch23=in.nextInt();
                                                  if(ch23==3)
                                                  {
                                                      System.out.println("Right Answer !!!! You won ******Rs 3 Crore******");
                                                  }
                                                  else
                                                  {
                                                      System.out.println("You have given a wrong answer, the answer should be 3. Computer mouse");
                                                      System.out.println("Total prize money won by you is: Rs 1 Crore");
                                                  }
                                              }
                                              else if(ch22==3)
                                              {
                                                  System.out.println("Right Answer !!!! You won ******Rs 3 Crore******");
                                              }
                                              else if(ch22==1||ch22==2||ch22==4)
                                              {  
                                                  System.out.println("You have given a wrong answer, the answer should be 3. Computer mouse");
                                                  System.out.println("Total prize money won by you is: Rs 1 Crore");
                                              }
                                              else if(ch22==8)
                                              {
                                                 System.out.println("Now you are out of the game show");
                                                 System.out.println("Total prize money won by you is: Rs 1 Crore");
                                              }
                                              if(ch22!=8&&(ch22==3||ch23==3))
                                              {
                                                  for(i=20;i<100000;--i);
                                                  for(j=20;j<1000;--j);
                                                  System.out.println();
                                                  System.out.println("Question 13: With the help of which natural phenomenon was Albert Einstein's General Theory of Relativity proved?");
                                                  System.out.println("Option are:");
                                                  System.out.println("1. Rainbow");
                                                  System.out.println("2. Mirage");
                                                  System.out.println("3. Tsunami");
                                                  System.out.println("4. Total Solar Eclipse");
                                                  System.out.println("Enter your choice");
                                                  System.out.println("If you need Lifeline then available lifeline are:");
                                                  if(la==0&&lb==0)
                                                  System.out.println("5. Audience Pole      6. 50-50");
                                                  else if(lb==0&&lc==0)
                                                  System.out.println("6. 50-50        7. Expert Advise");
                                                  else if(la==0&&lc==0)
                                                  System.out.println("5. Audience Pole          7. Expert Advise");
                                                  else if(la==0)
                                                  System.out.println("5. Audience Pole");
                                                  else if(lb==0)
                                                  System.out.println("6. 50-50");
                                                  else if(lc==0)
                                                  System.out.println("7. Expert Advise");
                                                  else
                                                  System.out.println("No Lifeline Available");
                                                  System.out.println("8. If you want to Quit ");
                                                  ch24=in.nextInt();
                                                  if(ch24==5&&la==0)
                                                  {
                                                     la++;
                                                     System.out.println("1. 45%       2. 15%   3. 15%     4.  25%");
                                                     System.out.println("Enter your answer");
                                                     ch25=in.nextInt();
                                                     if(ch25==4)
                                                     {
                                                         System.out.println("Right Answer !!!! You won ******* Rs 5 Crore *******");
                                                     }
                                                     else
                                                     {
                                                         System.out.println("You have given a wrong answer, the answer should be 4. Total Solar Eclipse");
                                                         System.out.println("Total prize money won by you is: Rs 3 Crore");
                                                     }
                                                  }
                                                  else if(ch24==6&&lb==0)
                                                  {
                                                     lb++;
                                                     System.out.println("Option are:");
                                                     System.out.println("1. Rainbow");
                                                     System.out.println("4. Total Solar Eclipse");
                                                     System.out.println("Enter your answer");
                                                     ch25=in.nextInt();
                                                     if(ch25==4)
                                                     { 
                                                         System.out.println("Right Answer !!!! You won ******Rs 5 Crore******");
                                                     }
                                                     else
                                                     {
                                                         System.out.println("You have given a wrong answer, the answer should be 4. Total Solar Eclipse");
                                                         System.out.println("Total prize money won by you is: Rs 3 Crore");
                                                     }
                                                  }
                                                  else if(ch24==7&&lc==0)
                                                  {
                                                     lc++;
                                                     System.out.println("I am confused between 1.Rainbow and 4. Total Solar Eclipse");
                                                     System.out.println("Enter your answer");
                                                     ch25=in.nextInt();
                                                     if(ch25==4)
                                                     {
                                                        System.out.println("Right Answer !!!! You won ******Rs 5 Crore******");
                                                     }
                                                     else
                                                     {
                                                        System.out.println("You have given a wrong answer, the answer should be 4. Total Solar Eclipse");
                                                        System.out.println("Total prize money won by you is: Rs 3 Crore");
                                                     }
                                                  }
                                                  else if(ch24==4)
                                                  {
                                                      System.out.println("Right Answer !!!! You won ******Rs 5 Crore******");
                                                  }
                                                  else if(ch24==1||ch24==2||ch24==3)
                                                  {  
                                                     System.out.println("You have given a wrong answer, the answer should be 4. Total Solar Eclipse");
                                                     System.out.println("Total prize money won by you is: Rs 3 Crore");
                                                  }
                                                  else if(ch24==8)
                                                  {
                                                     System.out.println("Now you are out of the game show");
                                                     System.out.println("Total prize money won by you is: Rs 3 Crore");
                                                  }
                                                  if(ch24!=8&&(ch24==4||ch25==4))
                                                  {
                                                      for(i=20;i<100000;--i);
                                                      for(j=20;j<1000;--j);
                                                      System.out.println();
                                                      System.out.println("Question 14: World's most Viewed Photo- It was taken on a drive to Napa Valley and was purchased by Bill Gates. The photo became the default Wallpaper of Windows XP since 2002?");
                                                      System.out.println("Option are:");
                                                      System.out.println("1. Jack Kirby");
                                                      System.out.println("2. Charles O' Rear");
                                                      System.out.println("3. Lee Kirby");
                                                      System.out.println("4. Steve Ditko");
                                                      System.out.println("Enter your choice");
                                                      System.out.println("If you need Lifeline then available lifeline are:");
                                                      if(la==0&&lb==0)
                                                      System.out.println("5. Audience Pole      6. 50-50");
                                                      else if(lb==0&&lc==0)
                                                      System.out.println("6. 50-50        7. Expert Advise");
                                                      else if(la==0&&lc==0)
                                                      System.out.println("5. Audience Pole          7. Expert Advise");
                                                      else if(la==0)
                                                      System.out.println("5. Audience Pole");
                                                      else if(lb==0)
                                                      System.out.println("6. 50-50");
                                                      else if(lc==0)
                                                      System.out.println("7. Expert Advise");
                                                      else
                                                      System.out.println("No Lifeline Available");
                                                      System.out.println("8. If you want to Quit ");
                                                      ch26=in.nextInt();
                                                      if(ch26==5&&la==0)
                                                      {
                                                         la++;
                                                         System.out.println("1. 5%       2. 70%   3. 20%     4.  5%");
                                                         System.out.println("Enter your answer");
                                                         ch27=in.nextInt();
                                                         if(ch27==2)
                                                         {
                                                            System.out.println("BRAVO !!!! You have defeated and conquered over the flash of 14 Question by your perceiverence. You have won Rs 7 Crore");
                                                         }
                                                         else
                                                         {
                                                            System.out.println("Oops!! You have given a wrong answer,and missed by a bit by winning the Game show the answer should be 2. Charles O'Rear");
                                                            System.out.println("Total prize money won by you is: Rs 5 Crore");
                                                         }
                                                      }
                                                      else if(ch26==6&&lb==0)
                                                      {
                                                         lb++;
                                                         System.out.println("Option are:");
                                                         System.out.println("2. Charles O'Rear");
                                                         System.out.println("3. Lee Kirby");
                                                         System.out.println("Enter your answer");
                                                         ch27=in.nextInt();
                                                         if(ch27==2)
                                                         { 
                                                            System.out.println("BRAVO !!!! You have defeated and conquered over the flash of 14 Question by your perceiverence. You have won Rs 7 Crore");
                                                         }
                                                         else
                                                         {
                                                            System.out.println("Oops!! You have given a wrong answer, and missed by a bit by winning the Game show the answer should be 4. Total Solar Eclipse");
                                                            System.out.println("Total prize money won by you is: Rs 5 Crore");
                                                         }
                                                      }
                                                      else if(ch26==7&&lc==0)
                                                      {
                                                         lc++;
                                                         System.out.println("I think the answer should be 2. Charles O'Rear");
                                                         System.out.println("Enter your answer");
                                                         ch27=in.nextInt();
                                                         if(ch27==2)
                                                         {
                                                             System.out.println("BRAVO !!!! You have defeated and conquered over the flash of 14 Question by your perceiverence. You have won Rs 7 Crore");
                                                         }
                                                         else
                                                         {
                                                            System.out.println("Oops!! You have given a wrong answer, and missed by a bit by winning the Game show the answer should be 4. Total Solar Eclipse");
                                                            System.out.println("Total prize money won by you is: Rs 5 Crore");
                                                         }
                                                      }
                                                      else if(ch26==2)
                                                      {
                                                         System.out.println("BRAVO !!!! You have defeated and conquered over the flash of 14 Question by your perceiverence. You have won Rs 7 Crore");
                                                      }
                                                      else if(ch26==1||ch26==3||ch26==4)
                                                      {  
                                                         System.out.println("Oops!! You have given a wrong answer, and missed by a bit by winning the Game show the answer should be 4. Total Solar Eclipse");
                                                         System.out.println("Total prize money won by you is: Rs 5 Crore");
                                                      }
                                                      else if(ch26==8)
                                                      {
                                                         System.out.println("Now you are out of the game show");
                                                         System.out.println("Total prize money won by you is: Rs 5 Crore");
                                                      }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
  }
}