//BASIC : time  o(n2),space  o(1)
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] nums={3,5,4,1,1};
        int miss=0;
        int rep=0;
        int[] arr=new int[2];
        for(int i=1;i<=nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    c++;
            }
            }
            if(c==0){
                miss=i;
            }
            else if(c==2){
                rep=i;
            }
        }
        arr[0]=rep;
        arr[1]=miss;
        System.out.println({arr[0],arr[1]});
         //System.out.println(arr[1]);
    
    }
}

//BETTER: time   o(2n)....space  o(n)
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] nums={3,5,4,1,1};
        int[] arr=new int[nums.length+1];
        int miss=-1,rep=-1;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        for(int j=1;j<=nums.length;j++){
            if(arr[j]==2){
                rep=j;
            }
            else if(arr[j]==0){
                miss=j;
            }
        }
        System.out.println(rep);
            System.out.println(miss);
    
    }
}

//OPTIMISED : time  o(n)...space  o(1)
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] nums={4,3,6,2,1,1};
        int n=nums.length;
        int s=0;
        int s1=(n*(n+1))/2;
        int s2=0;
        int s3=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        for(int j=0;j<n;j++){
            s2+=nums[j]*nums[j];
        }
        int v1=s-s1;//x-y=-4
        int v2=s2-s3;//x2-y2=-24
        v2=v2/v1;
        int x=(v1+v2)/2;
        int y=x-v1;
        System.out.println(x);
        System.out.println(y);
    }
}
