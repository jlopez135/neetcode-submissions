class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        s_dict = Counter(s)
        for char in t:
            if not s_dict.get(char):
                return False
            else:
                s_dict[char] -= 1
        return True