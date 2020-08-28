fn main() {
    let sample = left_to_right_modular_exponentiation(342, 423, 234);
    print!("{}\n", sample);
}

fn left_to_right_modular_exponentiation(base: u32, exponent: u32, modulus: u32) -> u32 {
    let exp = exponent;
    let starting_index = exp.leading_zeros() + 2;
    let mut result = base;

    // Iterate binary from left to right
    for n in starting_index..33{
        // Square and mod
        result = (result * result) % modulus;

        if exponent & (1 << 32 - n) != 0 {
            // Multiply and mod
            result = (result * base) % modulus;
        }
    }
    return result;
}
