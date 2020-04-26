/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts_pbo_04;

/**
 *
 * @author Njumbull
 */
public class TextBook
{
   private String title,     
                  author,    
                  publisher; 


public TextBook(String textTitle, String auth, String pub)
{
      title = textTitle;
      author = auth;
      publisher = pub;
}

public void set(String textTitle, String auth,
                   String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

public String toString()
   {
      String str = "Title: " + title
                   + "\nAuthor: " + author
                   + "\nPublisher: " + publisher;
      return str;
   }
}