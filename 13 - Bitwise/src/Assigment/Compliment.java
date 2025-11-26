package Assigment;

class Compliment {
    public int findComplement(int num) {
        int result = 0;
        int bitPosition = 0;
        
        while (num > 0) {
            int last = num & 1;        // extract last bit
            int flipped = last ^ 1;    // flip it
            result |= (flipped << bitPosition);
            bitPosition++;
            num >>= 1;  // shift right
        }
        return result;
    }
}