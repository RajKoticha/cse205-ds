
class Solution {
public:

   
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans;
    
        for(int row = 1;row<=numRows;row++){
           
            long long answer = 1;
        vector<int> ansRow;
        ansRow.push_back(1);
        for(int col = 1;col<row;col++){
            answer = answer * (row-col);
            answer = answer / (col);
            ansRow.push_back(answer);
        }
        ans.push_back(ansRow);
        }
        return ans;
        
    }
};