class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        blacklist= set()
        for num in nums:
            if num in blacklist:
                return True
            blacklist.add(num)
        return False