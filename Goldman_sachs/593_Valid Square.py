class Solution:
    def validSquare(self, p1: List[int], p2: List[int], p3: List[int], p4: List[int]) -> bool:
        s=set()
        s.add(math.dist(p1,p2))
        s.add(math.dist(p1,p3))
        s.add(math.dist(p1,p4))
        s.add(math.dist(p2,p3))
        s.add(math.dist(p2,p4))
        s.add(math.dist(p3,p4))

        if(len(s)==2 and 0 not in s):
            return True
        return False