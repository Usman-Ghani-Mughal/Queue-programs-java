/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueprograms;

import java.util.Scanner;

/**
 *
 * @author Usman Ghani Mughal
 */

class QCLink
{
    int info;
    QCLink link;
    QCLink Rear;
    QCLink()
    {
        this.Rear=null;
        this.link=null;
    }
    public void insert(int d)
    {
        QCLink tmp=new QCLink();
        tmp.info=d;
        if(this.Rear==null)
        {
            this.Rear=tmp;
            this.Rear.link=this.Rear;
        }
        else
        {
            tmp.link=this.Rear.link;
            this.Rear.link=tmp;
            this.Rear=this.Rear.link;
        }
    }
    public int del()
    {
        int tmp=0;
        if(this.Rear==null)
        {
            System.out.println("Queue is Empty");
            return tmp;
        }
        else
        {
            tmp=this.Rear.link.info;
            this.Rear.link=this.Rear.link.link;
            return tmp;
        }
    }
    public void display()
    {
        if(this.Rear==null)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            QCLink move=this.Rear.link;
            while(move!=this.Rear)
            {
                System.out.print(move.info+"  ");
                move=move.link;
            }
            System.out.print(move.info+"  ");
        }
    }
}

public class QueueByCircularLInk {
    public static void main(String []args)
    {
         QCLink obj=new  QCLink();
        Scanner take_input=new Scanner(System.in);
        int ch,val;
        while(true)
        {
            System.out.println("\nPress 1 for Insert");
            System.out.println("Press 2 for Del");
            System.out.println("Press 3 for display");
            ch=take_input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the value you want to add :");
                    val=take_input.nextInt();
                    obj.insert(val);
                    break;
                }
                case 2:
                {
                    System.out.println("this come out from Stack : "+obj.del());
                    break;
                }
                case 3:
                {
                    obj.display();
                    break;
                }
                default:
                {
                    System.out.println("You Gave Wrong Input");
                }
            }
        }
    }
}
