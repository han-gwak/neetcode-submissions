class DynamicArray:
    
    def __init__(self, capacity: int):
        self.size = 0
        self.capacity = capacity
        self.results = [0] * capacity

    def get(self, i: int) -> int:
        return self.results[i]

    def set(self, i: int, n: int) -> None:
        self.results[i] = n

    def pushback(self, n: int) -> None:
        if self.size == self.capacity:
            self.resize()
        self.results[self.size] = n
        self.size += 1

    def popback(self) -> int:
        self.size -= 1
        return self.results[self.size]

    def resize(self) -> None:
        self.capacity = self.capacity * 2
        new_results = [0] * self.capacity
        for i in range(self.size):
            new_results[i] = self.results[i]
        self.results = new_results

    def getSize(self) -> int:
        return self.size
    
    def getCapacity(self) -> int:
        return self.capacity