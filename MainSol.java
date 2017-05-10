public class Solution {


    public static void main(String[] args) {
        Tree root = new Tree(5,null,null);
        Tree left = new Tree(3,null,null);
        Tree right = new Tree(10,null,null);
        Tree leftleft = new Tree(20,null,null);
        Tree leftleftleft = new Tree(6,null,null);
        Tree rightleft = new Tree(1,null,null);
        Tree rightright = new Tree(15,null,null);
        Tree rightrightright = new Tree(8,null,null);
        Tree rightrightleft = new Tree(30,null,null);
        Tree rightrightleftright = new Tree(9,null,null);

        root.l = left;
        root.r = right;

        left.l=leftleft;
        leftleft.l=leftleftleft;

        right.l = rightleft;
        right.r=rightright;

        rightright.l=rightrightleft;
        rightright.r= rightrightright;

        rightrightleft.r=rightrightleftright;

        int result = new Solution2().solution(root);
    }
}
