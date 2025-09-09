class Solution:
    def longestCommonPrefix(self, strs):
        pre = strs[0]
        for c in strs[1:]:
            while not c.startswith(pre):
                pre = pre[:-1]
                if not pre:
                    return ""
        return pre


s = Solution()
strs = ["flower","flow","flight"]
res=s.longestCommonPrefix(strs)
print(res)