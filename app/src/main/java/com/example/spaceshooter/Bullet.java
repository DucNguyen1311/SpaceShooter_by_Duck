package com.example.spaceshooter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class Bullet {
    Bitmap bullet1, bullet2, bullet3, bullet4;
    private int bulletCount = 0;
    private int width;
    private int height;
    private int x;
    private int y;
    public Bullet(Resources res, int width, int height, int x, int y) {
        bullet1 = BitmapFactory.decodeResource(res, R.drawable.bullet1);
        bullet2 = BitmapFactory.decodeResource(res, R.drawable.bullet2);
        bullet3 = BitmapFactory.decodeResource(res, R.drawable.bullet3);
        bullet4 = BitmapFactory.decodeResource(res, R.drawable.bullet4);
        int i = 50;
        this.width = i + width;
        this.height = i + height;
        this.x = x;
        this.y = y;
        bullet1 = Bitmap.createScaledBitmap(bullet1, width, height, false);
        bullet2 = Bitmap.createScaledBitmap(bullet2, width, height, false);
        bullet3 = Bitmap.createScaledBitmap(bullet3, width, height, false);
        bullet4 = Bitmap.createScaledBitmap(bullet4, width, height, false);
    }

    public Bitmap getBullet() {
        bulletCount++;
        if (bulletCount > 12) {
            bulletCount = 1;
        }
        if (bulletCount > 0 && bulletCount < 4) {
            return bullet1;
        }
        if (bulletCount >= 4 && bulletCount < 7) {
            return bullet2;
        }
        if (bulletCount >= 7 && bulletCount < 10) {
            return bullet3;
        }
        if (bulletCount >= 10 && bulletCount < 13) {
            return bullet4;
        }
        return null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rect getRect() {
        return new Rect(x + 10, y + 10, x + width - 10, y + height - 10);
    }
}
