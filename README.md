# EduPlatform — MVP تعليمي
مشروع إدارة أكاديمية باستخدام Java 21 + Spring Boot + Spring Data JPA + H2 + HTML/CSS/JavaScript.

## التشغيل
1. افتح المجلد في VS Code.
2. تأكد من تثبيت Java 21 وMaven.
3. من Terminal داخل المجلد نفّذ: `mvn spring-boot:run`
4. افتح: http://localhost:8081

قاعدة البيانات H2 محفوظة على القرص في `./data/eduplatform`.
لوحة H2: http://localhost:8081/h2-console — JDBC URL: `jdbc:h2:file:./data/eduplatform` — المستخدم `sa` وكلمة المرور فارغة.

## العمليات
لكل مورد من الطلاب والمدرسين والكورسات والتسجيلات:
- GET `/api/{resource}` عرض الكل
- GET `/api/{resource}/{id}` عرض سجل واحد
- POST `/api/{resource}` إضافة
- PUT `/api/{resource}/{id}` تعديل
- DELETE `/api/{resource}/{id}` حذف

الموارد: `students`, `teachers`, `courses`, `enrollments`.
الإحصائيات: GET `/api/dashboard/stats`.

## حدود هذه النسخة
هذه نسخة تأسيسية قابلة للتشغيل وليست منتجًا جاهزًا للإنتاج. لا تشمل بعد تسجيل الدخول والصلاحيات، الدروس والواجبات والاختبارات والحضور والتصحيح والمدفوعات. سنضيف هذه الوحدات تباعًا، مع اختبارات ومعالجة أخطاء وأمان قبل النشر. الدفع الإلكتروني الحقيقي يحتاج مزود دفع معتمد.
