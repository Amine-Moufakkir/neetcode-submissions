class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        blacklist = []
        for num in nums:
            if num in blacklist:
                return True
            blacklist.append(num)
        return False