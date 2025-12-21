class time{

      int hours,minit,second;

      public time(int h1,int m1,int s1){
             this.hours=h1;
             this.minit=m1;
             this.second=s1;
      }

      public time add(time tt1,time tt2){
             this.hours+=tt2.hours;
             this.minit+=tt2.minit;
             this.second+=tt2.second;

              if(this.second >= 60){
                  this.minit=this.minit+(this.second/60);
                  this.second=this.second%60;
              }

             if(this.minit >= 60){
                this.hours=this.hours+(this.minit/60);
                this.minit=this.minit%60;
             } 

              return tt1;

      }
}

public class Extra_2 {
      public static void main(String[] args) {
       
          time t1=new time(3, 40, 45);
          time t2=new time(3, 60, 51);
          time t3=new time(0, 0, 0);

          t3=t1.add(t1, t2);

          System.out.println(t3.hours +"  "+t3.minit+"  "+t3.second);
      }
}
