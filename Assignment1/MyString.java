// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class MyString {
   private String value;

   public MyString(String var1) {
      this.value = var1;
   }

   public MyString() {
      this.value = "";
   }

   public String append(String var1) {
      this.value = this.value + var1;
      return this.value;
   }

   public static int countfun(String var0) {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = var0.length() - 1; var2 <= var3 && var0.charAt(var2) == ' '; ++var2) {
      }

      while(var3 >= var2 && var0.charAt(var3) == ' ') {
         --var3;
      }

      for(int var4 = var2; var4 <= var3; ++var4) {
         if (var0.charAt(var4) == ' ') {
            ++var1;

            while(var4 <= var3 && var0.charAt(var4) == ' ') {
               ++var4;
            }
         }
      }

      return var1 + 1;
   }

   public String Myreplace(char var1, char var2) {
      String var3 = "";

      for(int var4 = 0; var4 < this.value.length(); ++var4) {
         char var5 = this.value.charAt(var4);
         if (var5 == var1) {
            var3 = var3 + var2;
         } else {
            var3 = var3 + var5;
         }
      }

      this.value = var3;
      return this.value;
   }

   public static boolean Pallindrom(String var0) {
      int var1 = 0;

      for(int var2 = var0.length() - 1; var1 <= var2; --var2) {
         if (var0.charAt(var1) != var0.charAt(var2)) {
            return false;
         }

         ++var1;
      }

      return true;
   }

   public static void splice(String var0, int var1, int var2) {
      char[] var3 = new char[var0.length() - var2];
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var0.length(); ++var5) {
         if (var5 < var1 || var5 >= var1 + var2) {
            var3[var4] = var0.charAt(var5);
            ++var4;
         }
      }

      for(var5 = 0; var5 < var3.length; ++var5) {
         System.out.print(var3[var5]);
      }

      System.out.println();
   }

   public static void split(String var0, char var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < var0.length(); ++var3) {
         if (var0.charAt(var3) == var1) {
            for(int var4 = var2; var4 < var3; ++var4) {
               System.out.print(var0.charAt(var4));
            }

            System.out.println();
            var2 = var3 + 1;
         }
      }

      for(var3 = var2; var3 < var0.length(); ++var3) {
         System.out.print(var0.charAt(var3));
      }

      System.out.println();
   }

   public static void maxRepeat(String var0) {
      char var1 = var0.charAt(0);
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         int var4 = 0;

         for(int var5 = 0; var5 < var0.length(); ++var5) {
            if (var0.charAt(var3) == var0.charAt(var5)) {
               ++var4;
            }
         }

         if (var4 > var2) {
            var2 = var4;
            var1 = var0.charAt(var3);
         }
      }

      System.out.println("Max repeating character: '" + var1 + "' -> " + var2);
   }

   public static void sort(String var0) {
      char[] var1 = new char[var0.length()];

      int var2;
      for(var2 = 0; var2 < var0.length(); ++var2) {
         var1[var2] = var0.charAt(var2);
      }

      for(var2 = 0; var2 < var1.length - 1; ++var2) {
         for(int var3 = var2 + 1; var3 < var1.length; ++var3) {
            if (var1[var2] > var1[var3]) {
               char var4 = var1[var2];
               var1[var2] = var1[var3];
               var1[var3] = var4;
            }
         }
      }

      for(var2 = 0; var2 < var1.length; ++var2) {
         System.out.print(var1[var2]);
      }

      System.out.println();
   }

   public static void shift(String var0, int var1) {
      char[] var2 = new char[var0.length()];
      int var3 = 0;

      int var4;
      for(var4 = var1; var4 < var0.length(); ++var4) {
         var2[var3] = var0.charAt(var4);
         ++var3;
      }

      for(var4 = 0; var4 < var1; ++var4) {
         var2[var3] = var0.charAt(var4);
         ++var3;
      }

      for(var4 = 0; var4 < var2.length; ++var4) {
         System.out.print(var2[var4]);
      }

      System.out.println();
   }

   public static void reverse(String var0) {
      char[] var1 = new char[var0.length()];
      int var2 = 0;

      int var3;
      for(var3 = var0.length() - 1; var3 >= 0; --var3) {
         var1[var2] = var0.charAt(var3);
         ++var2;
      }

      for(var3 = 0; var3 < var1.length; ++var3) {
         System.out.print(var1[var3]);
      }

      System.out.println();
   }
}
