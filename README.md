android 7.0 use fleprovider  to invoke other apps to open files in paths

  String path="/sdcard/DCIM/Camera/IMG_20140922_210024_019.jpg";
  Intent intent = new Intent(Intent.ACTION_VIEW);
  intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
  File file = new File(path);     // path 是外部存储中的一个图片的路径
  Uri uri;
  intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
  uri = FileProvider.getUriForFile(MainActivity.this, MainActivity.this.getPackageName()+".provider", file);
  intent.setDataAndType(uri, "image/*");
  startActivity(Intent.createChooser(intent, null));//如果要直接打开相册的话，就直接传
