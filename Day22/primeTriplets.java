import math

# Sieve of Eratosthenes to precompute primes up to a certain limit
def sieve_of_eratosthenes(limit):
    is_prime = [True] * (limit + 1)
    is_prime[0], is_prime[1] = False, False
    for i in range(2, int(math.sqrt(limit)) + 1):
        if is_prime[i]:
            for j in range(i * i, limit + 1, i):
                is_prime[j] = False
    return is_prime

# Optimized atestcase function
def atestcase(n, a, primes):
    ones = a.count(1)
    
    if ones < 2:
        return 0
    
    # Count primes in the array
    prime_count = sum(1 for x in a if primes[x])
    
    return prime_count * (ones * (ones - 1)) // 2

# Main execution
def main():
    limit = 10**6  # Define the limit for prime precomputation (adjustable as per input constraints)
    primes = sieve_of_eratosthenes(limit)
    
    tno = int(input())  # Number of test cases
    
    for _ in range(tno):
        nn = int(input())  # Size of the array
        aa = list(map(int, input().split()))  # Input array
        
        # Output the result of the test case
        print(atestcase(nn, aa, primes))

# Run the main function
if __name__ == "__main__":
    main()
