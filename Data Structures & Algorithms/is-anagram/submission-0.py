class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_dict = dict()
        t_dict = dict()
        
        for l in s:
            if l not in s_dict:
                s_dict[l] = 1
            else:
                s_dict[l] += 1

        for le in t:
            if le not in t_dict:
                t_dict[le] = 1
            else:
                t_dict[le] += 1

        if s_dict == t_dict:
            return True
        return False