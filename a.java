public class Solution2 {
    public int solution(Tree T)
    {
        return recrsiveHelper(T,0);
    }

    private int recrsiveHelper(Tree T,int dir)
    {
        //tree is null or root only
        if(T==null || (T.l==null && T.r==null))
        {
            return 0;
        }
/*
        int leftleftTurns = 0;
        if(T.l!=null)
            leftleftTurns = recrsiveHelper(T.l.l);

        int leftRightTurns = 0;
        if(T.l!=null) {
            leftRightTurns = recrsiveHelper(T.l.r);
            if(T.l.r!=null)
                leftRightTurns++;
        }

        int rightleftTurns = 0;
        if(T.r!=null) {
            rightleftTurns = recrsiveHelper(T.r.l);
            if(T.r.l!=null)
                rightleftTurns++;
        }

        int rightRightTurns = 0;
        if(T.r!=null)
            rightRightTurns= recrsiveHelper(T.r.r);

        int leftTurns = Math.max(leftleftTurns,leftRightTurns);
        int rightTurns = Math.max(rightleftTurns,rightRightTurns);
*/
        int leftTurns=0;
        int rightTurns=0;
        if(dir == 1) {
             leftTurns = recrsiveHelper(T.l, -1);
            if(T.l!=null)
            {
                leftTurns++;
            }
             rightTurns = recrsiveHelper(T.r, 1);
        }else if(dir==-1){
            leftTurns = recrsiveHelper(T.l, -1);

            rightTurns = recrsiveHelper(T.r, 1);
            if(T.r!=null)
            {
                rightTurns++;
            }
        }
        else {
            leftTurns = recrsiveHelper(T.l, -1);

            rightTurns = recrsiveHelper(T.r, 1);
        }


        int rootTurns = Math.max(leftTurns,rightTurns);
        return rootTurns;
    }
}
