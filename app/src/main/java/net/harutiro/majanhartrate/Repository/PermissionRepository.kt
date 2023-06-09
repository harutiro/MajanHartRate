package net.harutiro.majanhartrate.Repository

import android.app.Activity
import pub.devrel.easypermissions.EasyPermissions

class PermissionRepository {
    fun requestPermissions(activity: Activity, explanation:String, requestCode:Int, permissions:Array<String>){
        //パーミッション確認
        //TODO:ロケーションの取得の常に許可をできるようにする
        if (!EasyPermissions.hasPermissions(
                activity.applicationContext,
                *permissions
            )
        ){
            // パーミッションが許可されていない時の処理
            EasyPermissions.requestPermissions(
                activity,
                explanation,
                requestCode,
                *permissions
            )
        }
    }
}