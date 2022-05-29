def bouncing_ball(h, bounce, window):
    if h <= 0 or bounce <= 0 or bounce >= 1 or window >= h:
        return -1
    seen = 1
    while h * bounce > window:
        seen += 2
        h *= bounce
    return seen