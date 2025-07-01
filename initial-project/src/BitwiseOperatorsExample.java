public class BitwiseOperatorsExample {

    public static void main(String[] args) {
        int a = 5;    // binário: 0101
        int b = 3;    // binário: 0011

        // Bitwise AND (&)
        int andResult = a & b; // 0101 & 0011 = 0001 (1 decimal)
        System.out.println("AND (a & b): " + andResult);

        // Bitwise OR (|)
        int orResult = a | b;  // 0101 | 0011 = 0111 (7 decimal)
        System.out.println("OR (a | b): " + orResult);

        // Bitwise XOR (^)
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110 (6 decimal)
        System.out.println("XOR (a ^ b): " + xorResult);

        // Bitwise NOT (~)
        int notResult = ~a;    // ~0101 = 1010 (em complemento de dois, é -6)
        System.out.println("NOT (~a): " + notResult);

        // Left shift (<<)
        int leftShift = a << 1; // desloca bits 1 posição à esquerda (multiplica por 2)
        System.out.println("Left Shift (a << 1): " + leftShift);

        // Right shift com sinal (>>)
        int negative = -8;       // binário: 11111111 11111111 11111111 11111000
        int rightShift = negative >> 2; // mantém o bit de sinal (preenche com 1)
        System.out.println("Right Shift com sinal (negative >> 2): " + rightShift);

        // Right shift sem sinal (>>>)
        int unsignedRightShift = negative >>> 2; // preenche com 0
        System.out.println("Right Shift sem sinal (negative >>> 2): " + unsignedRightShift);
    }
}
