class Solution {
    public boolean isValid(String word) {
        if(word.matches("^(?=.*[aeiouAEIOU])(?=.*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ])[a-zA-Z0-9]{3,}$")){return true;}return false;
    }
}
